package com.glre.RhythmElite;

import com.glre.helloandroid2.R;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloAndroid extends Activity {

	private Handler mHandler ;
	
	private Runnable mUpdateTimeTask = new Runnable() {
		  public void run() {
		    //ici ce que vous voulez executer
			System.exit(RESULT_OK);  
		    mHandler.postDelayed(this, 1000);
		  }
		};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mHandler = new Handler();
		mHandler.postDelayed(mUpdateTimeTask, 5000);
		
		
		TextView tv = new TextView(this);
		tv.setText(Build.MODEL);
		//tv.setText("toto");
		setContentView(tv);
		
		//ImageView iv = new ImageView(this);
		//iv.setImageResource(R.drawable.dessin);
		//setContentView(iv);
		
		//((Vibrator) getSystemService(Context.VIBRATOR_SERVICE)).vibrate(1000);
		
		//setContentView(R.layout.activity_hello_android);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_android, menu);
		return true;
	}

}
