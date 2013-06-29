package jp.kondouf.helloworld2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class HelloWorld2 extends Activity {
	
	/** Called when the activity is first occured. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView _helloWorldWord = new TextView(this);
		_helloWorldWord.setText("Hello, world2");
		setContentView(_helloWorldWord);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world2, menu);
		return true;
	}

}
