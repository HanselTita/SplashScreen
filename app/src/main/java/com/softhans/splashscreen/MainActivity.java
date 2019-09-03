package com.softhans.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

/**
 * 1. Create another activity which will be were you display your splash or welcome screen(WelcomeActivity)
 * NB: Or you change you MainActivity your splash Screen
 * 2. you can go to google and search for android splash screen images and download any then use to edit to suit you
 *3. paste your splash screen image into the drawable folder of res.
 * 4. in your welcome xml file, set the image as background of the activity.
 * 5. go to values/style and replace the "DarkActionBar" option with "NoActionBar", so that your app name does not appear on the welcome screen
 * 6. go to welcome activity, and in onCreate method,  create a thread variable and create a run method in it
 * 7. implement try and catch in the run method and luanch the Thread.
 * 8. Outside the onCreate method, click an onpause method and type in finish();
 * 9. Cut the intent filter in AndroidManifest.xml from MainActivity and paste in your welcomeActivity.
 * You can at a welcome toast if you wish...
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}
