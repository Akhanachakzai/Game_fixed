package com.example.zirakkhan.finalegame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  //  MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.intro_sound);

    public MediaPlayer intro_Sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    //    mediaPlayer.start();

        intro_Sound = MediaPlayer.create(MainActivity.this,R.raw.intro_sound);
        intro_Sound.start();
        intro_Sound.setVolume(100,100);




    }
    protected void onPause() {
        super.onPause();
        intro_Sound.pause();
    }
   // @Override
   /* protected void onPause() {
        super.onPause();
        mediaPlayer.release();
    }*/

    public void settings(View view){
        Intent i = new Intent(this,setingsActivity.class);
        startActivity(i);
    }
    public void Play(View view){
        Intent play = new Intent(this,Gam_Activity.class);
        startActivity(play);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
