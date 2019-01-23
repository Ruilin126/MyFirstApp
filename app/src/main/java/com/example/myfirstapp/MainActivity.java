package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public classMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_1_click(View ClickedView) {
        Button button1 = (Button)findViewById(R.id.Button1);
        Random r = new Random();
        int buttonHeight = button1.getHeight();
        int buttonWidth = button1.getWidth();
        int x = r.nextInt(1440 - buttonHeight);
        int y = r.nextInt(2880 - buttonWidth);
        button1.setX(x);
        button1.setY(y);
    }

}
