package com.theultimatedomain.testsampleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by marshallschmutz on 3/15/16.
 */
public class MarshallActivity extends AppCompatActivity {

    private Button mChange_color;
    private RelativeLayout mBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.marshall_activity);

        setUpUI();
    }

    private void setUpUI() {
        mChange_color = (Button) findViewById(R.id.change_color);
        mBackground = (RelativeLayout) findViewById(R.id.background);

        mChange_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    private void changeColor() {
        Random rand = new Random();

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        int color = Color.argb(127, r, g, b);

        mBackground.setBackgroundColor(color);
    }
}
