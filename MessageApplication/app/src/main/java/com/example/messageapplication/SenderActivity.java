package com.example.messageapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
    }

    public void sendMessage(View view){
        EditText messageEdit = (EditText) findViewById(R.id.text_message);
        String messageStr = messageEdit.getText().toString();

        Intent intent = new Intent(this,ReceiverActivity.class);
        intent.putExtra("message",messageStr);
        startActivity(intent);

    }
}
