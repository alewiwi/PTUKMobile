package com.example.citiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSelect(View view){
        TextView displayCity = (TextView) findViewById(R.id.display_city);
        Spinner citySpinner = (Spinner)findViewById(R.id.city_spinner);

        String cityName = String.valueOf(citySpinner.getSelectedItem());
        displayCity.setText(cityName);
    }
}
