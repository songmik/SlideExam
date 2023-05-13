package com.example.slideexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.content.ContextCompat
import com.example.slideexam.databinding.ActivityMainBinding
import com.ncorti.slidetoact.SlideToActView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.slideView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                view.outerColor = ContextCompat.getColor(applicationContext, R.color.orangeRed)
                view.sliderIcon = R.drawable.round_navigate_end
                view.iconColor = ContextCompat.getColor(applicationContext, R.color.orangeRed)
                binding.doneTV.visibility = View.VISIBLE

                handler.postDelayed({
                    startActivity(MoveActivity.getMoveIntent(this@MainActivity))
                }, 1000)
            }
        }
    }
}