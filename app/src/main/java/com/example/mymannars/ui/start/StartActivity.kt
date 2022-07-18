package com.example.mymannars.ui.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymannars.R
import com.example.mymannars.TutorialActivity
import com.example.mymannars.databinding.ActivityStartBinding
import com.example.mymannars.ui.tutorial.TutoralFragment
class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.startBtn.setOnClickListener{
            val intent = Intent(application,TutorialActivity::class.java)
            startActivity(intent)
        }


    }
}
