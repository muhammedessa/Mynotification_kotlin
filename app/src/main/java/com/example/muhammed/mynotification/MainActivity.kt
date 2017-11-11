package com.example.muhammed.mynotification

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn : Button

    companion object {
       var id = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.buttonNotify)

        btn.setOnClickListener {

            val intent = Intent()
            val pendingIntent = PendingIntent.getActivity(this@MainActivity,0,intent,0)
            val notification = Notification.Builder(this@MainActivity)
                    .setSmallIcon(R.drawable.notification_icon_background)
                    .setContentTitle("Muhammed Essa")
                    .setContentText("Hello Body")
            notification.setContentIntent(pendingIntent)
   val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


            notificationManager.notify(id,notification.build())
                   id++

        }
    }
}










