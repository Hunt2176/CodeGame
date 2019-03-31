package com.lapis.codefun.Activities

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson
import com.lapis.codefun.Fragments.HistoryFragment
import com.lapis.codefun.Fragments.StartFragment
import com.lapis.codefun.R
import com.lapis.codefun.backend.GameInstance
import com.lapis.codefun.backend.Tracker
import kotlinx.android.synthetic.main.pager_view.*
import java.io.File

class MainActivity : AppCompatActivity()
{
    private var saveFile: File? = null
    private var pageAdapter: PageAdapter? = null
    var tracker: Tracker = readTracker()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pager_view)
        saveFile = File(filesDir, "tracker.json")

        val pager = findViewById<ViewPager>(R.id.viewPager)
        pageAdapter = PageAdapter(supportFragmentManager)
        pageAdapter?.addTracker(tracker)

        pager.adapter = pageAdapter
        pager.offscreenPageLimit = 2

        pager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener
        {
            override fun onPageScrollStateChanged(state: Int){}
            override fun onPageSelected(position: Int){}

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int)
            {
                mainTabLayout.setScrollPosition(position, positionOffset, false)
            }
        })

        mainTabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(p0: TabLayout.Tab?) {}
            override fun onTabUnselected(p0: TabLayout.Tab?) {}

            override fun onTabSelected(p0: TabLayout.Tab?)
            {
                if (p0 == null) return
                pager.currentItem = p0.position
            }
        })
    }



    fun updateTrackerFile(tracker: Tracker)
    {
        saveFile?.writeText(tracker.toJson())
    }

    fun readTracker(): Tracker
    {
        val tracker = try
        {
            val file = saveFile
            Gson().fromJson(file!!.readText(), Tracker::class.java)
        }
        catch (e: Exception)
        {
            e.printStackTrace()
            Tracker()
        }
        pageAdapter?.addTracker(tracker)
        return tracker
    }

    override fun onPostResume() {
        super.onPostResume()
        println("HAS RESUMED")
        val instance = GameInstance.getInstance() ?: return
        instance.concludeGame(tracker)
        AlertDialog.Builder(this)
            .setTitle("You scored: ${tracker.gameHistory.last().score}")
            .setPositiveButton("Continue") { _,_ -> }
            .show()
        GameInstance.clearInstance()
        updateTrackerFile(tracker)
        readTracker()
    }
}

class PageAdapter(private val fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager)
{
    override fun getItem(position: Int): androidx.fragment.app.Fragment
    {
        if (fragmentManager.fragments.size != 0 && position <= fragmentManager.fragments.size)
        {
            return fragmentManager.fragments[position]
        }
        return when (position) {
            0 -> StartFragment()
            1 -> HistoryFragment()
            else -> StartFragment()
        }
    }

    fun addTracker(tracker: Tracker)
    {
        (this.getItem(1) as HistoryFragment).updateTracker(tracker)
    }
    override fun getCount(): Int = 2
}