package com.example.intentstartingaservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService_ extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TAG", "Service Created");
    }

    // FLAGS: Provides additional context about how the service was started.
    // It is a bitmask of flags that specify the nature of the start request.

    //startID: This ID allows you to handle or cancel specific start requests.
    // For example, you might want to stop the service for a particular request
    // while keeping it running for others.
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Retrieve data from the intent
        String data = intent.getStringExtra("extraData");


        // Do something with the data (here, we're just logging it)
        Log.d("TAG", "Service Started with data: " + data);

        //small pop-up message that provides feedback to the user in a non-intrusive way. It typically
        // appears briefly at the bottom of the screen and disappears automatically.
        Toast.makeText(this, "Service Started with data: " + data, Toast.LENGTH_SHORT).show();
        //The duration for which the toast is visible. It can be either Toast.LENGTH_SHORT



        // If we want the service to continue running until explicitly stopped
        return START_STICKY;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "Service Destroyed");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
