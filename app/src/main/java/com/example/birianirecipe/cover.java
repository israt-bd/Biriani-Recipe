package com.example.birianirecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
    }

    public void itihas(View view) {
        Intent intent = new Intent(cover.this,itihas.class);
        startActivity(intent);
    }

    public void recipe(View view) {
        Intent intent = new Intent(cover.this,MainActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(cover.this,about.class);
        startActivity(intent);
    }
}