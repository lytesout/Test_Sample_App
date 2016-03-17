package com.theultimatedomain.testsampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by student6 on 3/15/16.
 */
public class Scott extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scott_activity);

    }

    private Button btnLytesout;

    private void setupUI()
    {
        btnLytesout = (Button) findViewById(R.id.btnLytesout);
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

    }


}
