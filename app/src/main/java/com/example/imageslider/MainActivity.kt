package com.example.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imageslider.Adapters.Adapters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapters: Adapters
    lateinit var list:MutableList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadDate()

        adapters = Adapters(this)
        adapters.setContentList(list)

        viewPager2.adapter = adapters

    }

    private fun loadDate() {
        list =mutableListOf<Int>()
        list.add(R.drawable.ic_moon)
        list.add(R.drawable.ic_ronot)
        list.add(R.drawable.ic_sun)

    }
}