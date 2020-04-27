package com.test.btvn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layoutId;
    String country;
    int flag[];

    public CustomAdapter(@NonNull Context context, int layoutId, String country, int[] flag) {
        super(context, layoutId);

        this.context=context;
        this.layoutId=layoutId;
        this.country=country;
        this.flag=flag;
    }

    @Override
    public int getCount() {
        return  country.length();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView=inflater.inflate(layoutId, null);
        return convertView;
    }
}
