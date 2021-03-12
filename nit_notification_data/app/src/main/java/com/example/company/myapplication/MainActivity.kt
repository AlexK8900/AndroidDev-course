package com.example.company.myapplication

import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        notify.setOnClickListener {
            val builder = NotificationCompat.Builder(this)
                    .setSmallIcon(android.R.drawable.alert_dark_frame)
                    .setContentTitle("Title")
                    .setContentText("${editText.text.toString()}")
            val notification = builder.build()
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1,notification)
        }
    }
}
