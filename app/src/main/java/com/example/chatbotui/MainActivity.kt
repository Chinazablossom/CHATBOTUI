package com.example.chatbotui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatbotui.adapters.DMsAdapter
import com.example.chatbotui.adapters.UserAdapter
import com.example.chatbotui.data.DataSource
import com.example.chatbotui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val users = DataSource().users()
        val dms = DataSource().userMessages()

        binding.apply {
            rvHorizontal.adapter = UserAdapter(this@MainActivity, users)
            rvVertical.adapter = DMsAdapter(this@MainActivity, dms)

            rvHorizontal.setHasFixedSize(true)
            rvVertical.setHasFixedSize(true)
        }





    }




}