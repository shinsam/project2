package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "TEST", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "TEST2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "TEST3", Toast.LENGTH_SHORT).show();

    }
}
