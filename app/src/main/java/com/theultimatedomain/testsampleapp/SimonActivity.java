package com.theultimatedomain.testsampleapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by simon on 3/15/16.
 */
public class SimonActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.simon_activity);
	}
}
