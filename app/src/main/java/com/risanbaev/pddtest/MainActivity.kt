package com.risanbaev.pddtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

var clickCount = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.let {
            clickCount = it.getInt("COUNTER_KEY")
            clickerTextView.text = "Count $clickCount"
        }

        buttonClickView.setOnClickListener{
            clickCount++
            clickerTextView.text = "Count $clickCount"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "onResume")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putInt("COUNTER_KEY", clickCount)
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "onDestroy")
    }
}