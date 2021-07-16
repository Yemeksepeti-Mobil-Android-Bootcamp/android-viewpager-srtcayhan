package com.example.android_viewpager_srtcayhan.utils

import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2


class GateTransformation : ViewPager2.PageTransformer {
    private val TAG = "GateAnimation"
    override fun transformPage(page: View, position: Float) {
        page.setTranslationX(-position * page.getWidth())
        if (position < -1) {    // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0F)
        } else if (position <= 0F) {    // [-1,0]
            page.setAlpha(1F)
            page.setPivotX(0F)
            page.setRotationY(90 * Math.abs(position))
        } else if (position <= 1F) {    // (0,1]
            page.setAlpha(1F)
            page.setPivotX(page.getWidth().toFloat())
            page.setRotationY(-90 * Math.abs(position))
        } else {    // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0F)
        }
    }
}
