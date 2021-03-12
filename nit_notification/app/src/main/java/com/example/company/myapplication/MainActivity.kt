package com.example.company.myapplication

import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.alert_dark_frame)
                .setContentTitle("Title")
                .setContentText("Text")
        val notification = builder.build()
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notify.setOnClickListener {
            notificationManager.notify(1,notification)
        }
    }
}
