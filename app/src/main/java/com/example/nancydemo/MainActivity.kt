package com.example.nancydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nancydemo.SpleshScreen.Companion.list
import com.example.nancydemo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var city = arrayOf("Surat1","Surat2","Surat3","Surat4","Surat5","Surat6","Surat7","Surat8","Surat9","Surat10","Surat11","Surat12","Surat13","Surat14","Surat15","Surat16")
    var like = arrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tabLayout.addTab(binding.tabLayout.newTab().setIcon(R.drawable.ic_baseline_favorite_24))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sport"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Movie"))


        val adapter = MyAdapter(this, supportFragmentManager, binding.tabLayout.tabCount)
        binding.viewPager.adapter = adapter

        binding. viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

//        var adapter =LikeAdapter(this,list,like)
//        var lm = LinearLayoutManager(this)
//        binding.rvView.layoutManager =lm
//        binding.rvView.adapter =adapter

    }
}