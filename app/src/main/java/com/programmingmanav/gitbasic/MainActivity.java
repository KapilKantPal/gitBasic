package com.programmingmanav.gitbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView);

    }

    public void genNumber(View view) {
        num = (int)( Math.random()*(101));
        Log.i("Random" , String.valueOf(num));
        text.setText(" Random Number = "+num);
    }

    public void Next(View view) {
    }
}