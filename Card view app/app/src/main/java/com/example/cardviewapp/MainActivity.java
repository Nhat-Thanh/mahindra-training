package com.example.cardviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private String[] title = {
            "Master Android Pro App",
            "Master Flutter App",
            "Master Android App",
            "Youtube Channel",
            "Rate Us"
    };

    private String[] description = {
            "Learn android app development from zero to hero",
            "Learn Flutter from scratch",
            "Helping more than 780,000+ Developers to learn android",
            "AndroidMasterApp is our official channel",
            "Keep us making new tutorials, Rate us 5 stars on Udemy"
    };

    private Integer[] images = {
            R.drawable.masterpro,
            R.drawable.loggo,
            R.drawable.masterandroid,
            R.drawable.youtube,
            R.drawable.satar
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this, title, description, images);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Handling click Events on items
        AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Item 4 Selected", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        };
        listView.setOnItemClickListener(myOnItemClickListener);
    }
}