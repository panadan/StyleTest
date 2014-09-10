package com.example.ced.styletest;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


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
        TextView tv7 = (TextView) findViewById(R.id.colorText);
        tv7.setTypeface(tf);
        TextView tv8 = (TextView) findViewById(R.id.colorText2);
        tv8.setTypeface(tf);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
               R.array.hair_color_array, R.layout.spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);


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
