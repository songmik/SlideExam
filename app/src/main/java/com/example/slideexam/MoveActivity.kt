package com.example.slideexam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
    }

    companion object {
        fun getMoveIntent(context: Context): Intent {
            val intent = Intent(context, MoveActivity::class.java)
            return intent
        }
    }
}