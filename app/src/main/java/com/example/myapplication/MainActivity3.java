package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    String[] std = {"Nimra", "Shafi", "Hira","Farah","Shabnam","shaharyar","Shahzaib","Laiba","Areeba","Ali","Kainat","Jannat","Ahmed","Khan","Areesha","Aliza","Kinza","Hadiqah","Zainab"};
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = (Button) findViewById(R.id.button4);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(myintent);
            }
        });

        list = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity3.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,std);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 2) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Toast.makeText(MainActivity3.this, "Welcome shaharyar", Toast.LENGTH_SHORT).show();
                }
                else if (position == 0){
                    Toast.makeText(MainActivity3.this, "Welcome Nimra", Toast.LENGTH_SHORT).show();
                }
                else if (position == 1){
                    Toast.makeText(MainActivity3.this, "Welcome Shafi", Toast.LENGTH_SHORT).show();
                }
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
            Intent myintent = new Intent(MainActivity3.this,MainActivity.class);
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