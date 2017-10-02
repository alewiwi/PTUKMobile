package com.example.multiactivityapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText message = (EditText) findViewById(R.id.editText);
        String messageText = message.getText().toString();
        //Intent intent = new Intent(this,ReceiveMessageActivity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        //intent.putExtra("message",messageText);
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        startActivity(intent);
    }
}
