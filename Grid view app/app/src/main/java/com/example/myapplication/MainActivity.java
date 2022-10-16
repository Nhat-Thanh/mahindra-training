package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);

        ArrayList<CoursesModel> courseModelArrayList = new ArrayList<CoursesModel>();
        courseModelArrayList.add(new CoursesModel("The Complete Android 12 Course", R.drawable.course1));
        courseModelArrayList.add(new CoursesModel("The Complete Java Developer Course", R.drawable.course2));
        courseModelArrayList.add(new CoursesModel("The Complete Kotlin Course", R.drawable.course3));
        courseModelArrayList.add(new CoursesModel("The Complete Data Structure and Algorithms Course", R.drawable.course4));

        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);
    }
}