package com.programmingmanav.gitbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);



    }

    public void Next(View view) {
        startActivity(new Intent (Animation.this , Demo_Activity.class));
    }
}