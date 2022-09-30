package com.example.localnotification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

object notification {

    fun grtNotification(context: Context) {
        var notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        createChannel(notificationManager)

        var builder = buildNotification(context)

        notificationManager.notify(1,builder.build())
    }


    fun createChannel(notificationManager: NotificationManager) {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            var channel =
                NotificationChannel("1", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun buildNotification(context: Context): NotificationCompat.Builder {

        return NotificationCompat.Builder(context, "1").setContentTitle("hellop android")
            .setContentText("Welcome to kotlin")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
    }
}