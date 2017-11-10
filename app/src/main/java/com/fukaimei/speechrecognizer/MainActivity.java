package com.fukaimei.speechrecognizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_voice_recognize).setOnClickListener(this);
		findViewById(R.id.btn_voice_compose).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.btn_voice_recognize) {
			Intent intent = new Intent(this, VoiceRecognizeActivity.class);
			startActivity(intent);
		} else if (v.getId() == R.id.btn_voice_compose) {
			Intent intent = new Intent(this, VoiceComposeActivity.class);
			startActivity(intent);
		}
	}

}
