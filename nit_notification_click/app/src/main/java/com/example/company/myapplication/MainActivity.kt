package com.example.company.myapplication

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_notification.setOnClickListener {
            val resultIntent = Intent(this, FinishActivity::class.java)
            val resultPendingIntent = PendingIntent.getActivity(
                    this, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT)


            val builder = NotificationCompat.Builder(this)
                    .setSmallIcon(android.R.drawable.alert_dark_frame)
                    .setContentTitle("Title")
                    .setContentText("Text")
                    .setContentIntent(resultPendingIntent)
                    .setAutoCancel(true)
            val notification = builder.build()

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1,notification)
        }
    }
}
