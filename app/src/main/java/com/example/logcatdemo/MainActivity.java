package com.example.logcatdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // To be passed as the tag in calls to methods of the android.util.Log class
    // e.g. Log.i(TAG, Message)
    private static final String TAG = "LogcatDemo";
    private int mNumber = 5;
    private int mDivisor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            // Divide an integer by zero
            int result = mNumber / mDivisor;
        } catch (ArithmeticException aex) {
            // Send the exception details to logcat//
            Log.e(TAG, "An error occurred in onCreate(Bundle savedInstanceState). See Details:-\n" + aex);
        }
    }
}
