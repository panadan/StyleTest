package com.example.ced.styletest;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Yellowtail-Regular.otf");

        TextView tv = (TextView) findViewById(R.id.name2Text);
        tv.setTypeface(tf);
        TextView tv2 = (TextView) findViewById(R.id.youText);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.yourLvrText);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.nameText);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.yearText);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.yearText2);
        tv6.setTypeface(tf);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
