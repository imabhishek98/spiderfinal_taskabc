package com.example.android.spiderfinal_task;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }




    }


    public void click(View view)
    {
        EditText t = (EditText) findViewById(R.id.location_textbox);
        String x = t.getText().toString();
        ForecastFragment.FetchWeatherTask fetchWeatherTask = new ForecastFragment.FetchWeatherTask();
        fetchWeatherTask.execute(x);
    }

}