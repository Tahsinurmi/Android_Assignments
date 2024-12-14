package com.example.android_assignments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button assignment1, assignment2, assignment3, assignment4, assignment5, assignment6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findID();

        assignment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment1.class);
                startActivity(intent);
            }
        });

        assignment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment2.class);
                startActivity(intent);
            }
        });

        assignment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment3.class);
                startActivity(intent);
            }
        });

        assignment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment4.class);
                startActivity(intent);
            }
        });

        assignment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment5.class);
                startActivity(intent);
            }
        });

        assignment6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment6.class);
                startActivity(intent);
            }
        });
    }


    private void findID() {
        assignment1 = findViewById(R.id.assignment01);
        assignment2 = findViewById(R.id.assignment02);
        assignment3 = findViewById(R.id.assignment03);
        assignment4 = findViewById(R.id.assignment04);
        assignment5 = findViewById(R.id.assignment05);
        assignment6 = findViewById(R.id.assignment06);
    }
}