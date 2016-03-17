package com.theultimatedomain.testsampleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;


/**
 * Created by student6 on 3/15/16.
 */
public class Scott extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scott_activity);
        setupUI();
        setupClickListeners();
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

    }

    private Button btnScottsLayout;
    private RelativeLayout background;

    private void setupUI()
    {
        btnScottsLayout = (Button) findViewById(R.id.btnScottsLayout);
        background = (RelativeLayout) findViewById(R.id.background);
    }

    private void setupClickListeners()
    {
        btnScottsLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lytesoff();
            }
        });
    }

    private void lytesoff()
    {
         background.setBackgroundColor(Color.BLACK);
    }


}
