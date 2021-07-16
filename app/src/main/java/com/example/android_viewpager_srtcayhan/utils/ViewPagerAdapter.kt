package com.example.android_viewpager_srtcayhan.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android_viewpager_srtcayhan.fragments.FirstOnBoardingFragment
import com.example.android_viewpager_srtcayhan.fragments.SecondOnBoardingFragment
import com.example.android_viewpager_srtcayhan.fragments.ThirdOnBoardingFragment
import com.example.android_viewpager_srtcayhan.fragments.FourthOnBoardingFragment

private const val FRAGMENT_COUNT = 4

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstOnBoardingFragment()
            1 -> SecondOnBoardingFragment()
            2 -> ThirdOnBoardingFragment()
            3 -> FourthOnBoardingFragment()
            else -> ThirdOnBoardingFragment()
        }
    }


}