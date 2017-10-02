package com.example.myapplication;

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
    public void selectCity(View view){
        TextView tView = (TextView) findViewById(R.id.textView);
        Spinner citySpinner = (Spinner) findViewById(R.id.spinner);
        String cityName = String.valueOf(citySpinner.getSelectedItem());
        tView.setText(cityName);

    }
}
