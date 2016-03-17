package com.theultimatedomain.testsampleapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        setupClickListeners();
    }

    private Button btnScottsLayout;


    private void setupUI()
    {
        btnScottsLayout = (Button) findViewById(R.id.btnLytesout);
    }

    private void setupClickListeners()
    {
        btnScottsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentScott = new Intent(MainActivity.this, Scott.class);
                MainActivity.this.startActivity(intentScott);
            }
        });
    }


}
