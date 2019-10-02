package com.code95.rtlviewpager

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.viewpager.widget.ViewPager

class ByDirectionViewpager constructor(context: Context, attrs: AttributeSet? = null) :
    ViewPager(context, attrs) {

    private var mIsRtlOriented: Boolean = false

    fun setRtlOriented(isRtlOriented: Boolean) {
        mIsRtlOriented = isRtlOriented
        currentItem = if (mIsRtlOriented && adapter != null) {
            adapter!!.count - 1
        } else {
            0
        }
    }

    override fun setLayoutDirection(layoutDirection: Int) {
        super.setLayoutDirection(View.LAYOUT_DIRECTION_LTR)
    }

}