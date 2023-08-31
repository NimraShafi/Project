package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button play, pause, btn;
    MediaPlayer mediaPlayer;
    boolean isPlaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn = findViewById(R.id.but);
        play = findViewById(R.id.button3);
        pause = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(myintent);
            }
        });
        mediaPlayer = MediaPlayer.create(this, R.raw.safari_song);


        play.setOnClickListener(v -> {
            if(!isPlaying){
                mediaPlayer.start();
                isPlaying = true;

            }
        });
        pause.setOnClickListener(v -> {
            if(!isPlaying){
                mediaPlayer.stop();
                isPlaying = false;
                //Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.home) {
            Intent myintent = new Intent(MainActivity4.this,MainActivity.class);
            startActivity(myintent);

        } else if (itemId == R.id.setting) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        } else if(itemId == R.id.delete){
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.about) {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}