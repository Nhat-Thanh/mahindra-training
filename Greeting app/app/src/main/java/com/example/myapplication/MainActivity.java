package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.myButton);
        EditText editTextName = findViewById(R.id.EditTextName);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msg = new Intent(view.getContext(), ActivityShowName.class);
                String name = editTextName.getText().toString();

                if (!name.isEmpty()) {
                    msg.putExtra("MyName", name);
                    startActivity(msg);
                } else {
                    Toast toast = new Toast(getApplicationContext());
                    toast.setText("Please enter your name");
                    toast.show();
                }
            }
        });
    }
}