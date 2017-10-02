package com.example.messageapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        TextView textView = (TextView) findViewById(R.id.message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        textView.setText(message);
    }
}
