package com.example.cardviewapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mainTitles;
    private final String[] description;
    private final Integer[] images;

    public MyListAdapter(@NonNull Activity context, String[] mainTitles, String[] description, Integer[] images) {
        super(context, R.layout.item_custom_layout,mainTitles);
        this.context = context;
        this.mainTitles = mainTitles;
        this.description = description;
        this.images = images;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_custom_layout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView subTitle  = rowView.findViewById(R.id.subtitle);
        ImageView imageView = rowView.findViewById(R.id.icon);

        titleText.setText(mainTitles[position]);
        subTitle.setText(description[position]);
        imageView.setImageResource(images[position]);

        return rowView;
    }
}