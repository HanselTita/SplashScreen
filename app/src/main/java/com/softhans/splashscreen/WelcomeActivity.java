package com.softhans.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread thread = new Thread()
        {

            @Override
            public void run() {
                try
                {
                    //our screen should appear for 5000milliseconds = 5seconds.
                    sleep(5000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    //send user to the MainActivity or where you want to go from here
                    startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                }
            }
        };

        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
