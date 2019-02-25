package com.theappnerds.shubham.demogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition addition = new Addition(5, 6);
        Substraction substraction = new Substraction(15, 6);
        Multplication multplication = new Multplication(5, 6);

        String a ="Hi";
        String b ="Hello";
        String c ="how are you?";
        String d ="I am fine";
        String e ="Thank you";

        sendToast();
        changedToast();
        extraToast();
    }

    private void sendToast() {
        Toast.makeText(this, "Thank You", Toast.LENGTH_SHORT).show();
    }

    private void changedToast() {
        Toast.makeText(this, "changed Toast to again Thank you", Toast.LENGTH_SHORT).show();
    }
    private void extraToast() {
        Toast.makeText(this, "Extra Thank you", Toast.LENGTH_SHORT).show();
    }
}
