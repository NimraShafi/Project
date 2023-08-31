package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
    VideoView videoView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = (Button) findViewById(R.id.button4);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        videoView = (VideoView) findViewById(R.id.vView2);

        videoView.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio));
        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView);
        videoView .setMediaController(mc2);
        mc2.setAnchorView(videoView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(myintent);
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
            Intent myintent = new Intent(MainActivity2.this,MainActivity.class);
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