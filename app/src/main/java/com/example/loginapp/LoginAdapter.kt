package com.example.loginapp

import android.content.Context
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout
import java.security.AccessControlContext

class LoginAdapter(fm: FragmentManager, totalTabs: Int) : FragmentPagerAdapter(fm) {

    private var totalTabs: Int = totalTabs
//    private var m_context: Context = context


    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                LoginTabFragment()

            }
            1 -> {
                SignUpFragment()

            }
            else -> {
                LoginTabFragment()
            }
        }
    }
}
