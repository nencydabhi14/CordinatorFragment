package com.example.nancydemo

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.nancydemo.frg.HomeFragment
import com.example.nancydemo.frg.SportFragment

class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {
  
    // this is for fragment tabs  
    override fun getItem(position: Int): Fragment {
        when (position) {  
            0 -> {  
              //  val homeFragment: HomeFragment = HomeFragment()  
                return HomeFragment()
            }  
            1 -> {  
                return SportFragment()
            }
            else -> return HomeFragment()
        }  
    }  
  
    // this counts total number of tabs  
    override fun getCount(): Int {  
        return totalTabs  
    }  
}  