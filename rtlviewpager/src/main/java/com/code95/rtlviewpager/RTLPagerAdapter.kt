package com.code95.rtlviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class RTLPagerAdapter(fm: FragmentManager, var tabs: MutableList<Tab>, var isRtlOriented: Boolean) :
    FragmentPagerAdapter(
        fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
    init {
        if (isRtlOriented) {
            tabs = tabs.asReversed()
        }
    }

    override fun getItem(position: Int): Fragment {
        return tabs[position].fragment
    }

    override fun getCount(): Int {
        return tabs.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabs[position].title
    }

}