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
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

    }

    private Button btnLytesout;
    private RelativeLayout background;
    private boolean boolLytes = true;

    private void setupUI()
    {
        btnLytesout = (Button) findViewById(R.id.btnLytesout);
        background = (RelativeLayout) findViewById(R.id.background);
    }

    private void setupClickListeners()
    {
        btnLytesout.setOnClickListener(new View.OnClickListener()
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
        if(boolLytes)
        {
            background.setBackgroundColor(Color.BLACK);
            btnLytesout.setText("lyteson");
            boolLytes = false;
        }else{
            background.setBackgroundColor(Color.parseColor("#3bcc58"));
            btnLytesout.setText("lytesout");
            boolLytes = true;
        }

    }


}
