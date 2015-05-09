package com.example.sivaprasad.colorbuttons;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button button_red ;
    private Button button_blue ;
    private Button button_green ;
    private Button button_purple ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the handlers to the button view
        button_red = (Button) findViewById(R.id.red);
        button_blue = (Button) findViewById(R.id.blue);
        button_green = (Button) findViewById(R.id.green);
        button_purple = (Button) findViewById(R.id.purple);

        // Set the listeners on the buttons
        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ONCLICK","button clicked");
                if ( v.getId() == R.id.red){
                    Log.d("ONCLICK","red button clicked");
                    v.setBackgroundColor(Color.RED);
                }
            }

        });
        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ONCLICK","button clicked");
            }
        });
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ONCLICK","button clicked");
            }
        });
        button_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ONCLICK","button clicked");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
