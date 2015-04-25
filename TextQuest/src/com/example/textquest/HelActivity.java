package com.example.textquest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_author);
	}

	public void menuback(View view) {
		finish();
	}
}
