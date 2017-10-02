package com.example.multiactivityapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(message);
        Toast.makeText(ReceiveMessageActivity.this,"This is a Toast",Toast.LENGTH_LONG).show();
    }
}
