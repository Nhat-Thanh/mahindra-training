package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityShowName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);

        TextView TextViewName = findViewById(R.id.TextViewName);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            StringBuilder text = new StringBuilder("I'm ");
            text.append(extras.getString("MyName"));
            text.append(", I want to become a C++ Expert");
            TextViewName.setText(text.toString());
        }
    }
}