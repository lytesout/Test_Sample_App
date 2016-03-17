package com.theultimatedomain.testsampleapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnScottsLayout;
    private Button btnSimon;
    private Button btnMarshall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        setupClickListeners();
    }

    private void setupUI()
    {
        btnScottsLayout = (Button) findViewById(R.id.btnScottsLayout);
        btnMarshall = (Button) findViewById(R.id.marshall_button);
        btnSimon = (Button) findViewById(R.id.simon_activity_btn);
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

        btnSimon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SimonActivity.class);
                startActivity(intent);
            }
        });

        btnMarshall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marshallIntent = new Intent(MainActivity.this, MarshallActivity.class);
                startActivity(marshallIntent);
            }
        });
    }


}
