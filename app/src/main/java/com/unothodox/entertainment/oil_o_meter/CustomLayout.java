package com.unothodox.entertainment.oil_o_meter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomLayout extends ArrayAdapter<String> {

    public CustomLayout(Context context, ArrayList<String> e) {
        super(context, R.layout.custom_layout, e);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inf = LayoutInflater.from(getContext());
        @SuppressLint("ViewHolder")
        View v = inf.inflate(R.layout.custom_layout, parent, false);

        TextView tv = v.findViewById(R.id.tv);
        String s = getItem(position);
        tv.setText(s);

        return v;
    }
}
