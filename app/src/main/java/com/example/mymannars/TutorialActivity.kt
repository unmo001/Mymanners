package com.example.mymannars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.mymannars.databinding.ActivityTutorialBinding
import com.example.mymannars.ui.tutorial.TutoralFragment
import com.example.mymannars.ui.tutorial.TutorialFragment_second
import com.example.mymannars.ui.tutorial.TutorialFragment_third
private const val NUM_PAGES = 3
class TutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorialBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val pager = binding.pager
        val pagerAdapter = PagerAdapter(this)
        pager.adapter = pagerAdapter
    }

    private inner class PagerAdapter(fa:FragmentActivity):FragmentStateAdapter(fa){
        override fun getItemCount(): Int = NUM_PAGES


        override fun createFragment(position: Int): Fragment =
            when(position){
                0->{
                    TutoralFragment()
                }
                1->{
                   TutorialFragment_second()
                }
                2->{
                    TutorialFragment_third()
                }
                else->{
                    TutoralFragment()
                }
            }

    }
}
