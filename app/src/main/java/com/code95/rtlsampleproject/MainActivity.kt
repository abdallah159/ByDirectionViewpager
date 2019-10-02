package com.code95.rtlsampleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.code95.rtlviewpager.RTLPagerAdapter
import com.code95.rtlviewpager.Tab
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAB_NEWS = 1
    private val TAB_EVENTS = 2
    private val TAB_PHOTOS = 3

    var mTabsAdapter: RTLPagerAdapter? = null
    var mTabs: MutableList<Tab> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        initArabicTabs()
//        setArabicAdapters()
        initEnglishTabs()
        setEnglishAdapters()
    }

    private fun initArabicTabs() {
        mTabs = mutableListOf(
            Tab(TAB_NEWS, "الاخبار", SampleFragment.newInstance("الاخبار", TAB_NEWS)),
            Tab(TAB_EVENTS, "الاحداث", SampleFragment.newInstance("الاحداث", TAB_EVENTS)),
            Tab(TAB_PHOTOS, "المعرض", SampleFragment.newInstance("المعرض", TAB_PHOTOS))
        )
    }

    private fun initEnglishTabs() {
        mTabs = mutableListOf(
            Tab(TAB_NEWS, "News", SampleFragment.newInstance("News", TAB_NEWS)),
            Tab(TAB_EVENTS, "Events", SampleFragment.newInstance("Events", TAB_EVENTS)),
            Tab(TAB_PHOTOS, "Gallery", SampleFragment.newInstance("Gallery", TAB_PHOTOS))
        )
    }

    private fun setEnglishAdapters() {
        mTabsAdapter = RTLPagerAdapter(supportFragmentManager, mTabs, false)
        viewpager.setAdapter(mTabsAdapter)
        viewpager.setRtlOriented(false)
        tablayout.setupWithViewPager(viewpager)
    }

    private fun setArabicAdapters() {
        mTabsAdapter = RTLPagerAdapter(supportFragmentManager, mTabs, true)
        viewpager.setAdapter(mTabsAdapter)
        viewpager.setRtlOriented(true)
        tablayout.setupWithViewPager(viewpager)
    }
}
