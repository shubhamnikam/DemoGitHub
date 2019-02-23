package com.theappnerds.shubham.demogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        sendToast();
        anotherToast();
    }

    private void sendToast() {
        Toast.makeText(this, "Thank You", Toast.LENGTH_SHORT).show();
    }

    private void anotherToast() {
        Toast.makeText(this, "One More Time Thank you", Toast.LENGTH_SHORT).show();
    }
}
