package com.example.localnotification

import android.app.Notification
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.localnotification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            notification.grtNotification(this)
        }
    }
}