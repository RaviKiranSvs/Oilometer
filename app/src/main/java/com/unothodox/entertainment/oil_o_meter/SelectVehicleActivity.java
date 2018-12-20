package com.unothodox.entertainment.oil_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class SelectVehicleActivity extends AppCompatActivity {

    GridView gv_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_vehicle);

        gv_grid = findViewById(R.id.gv_grid);

        setGridView();
    }

    void setGridView()  {
        ListAdapter adap = new CustomLayout(this, getStrings());
        gv_grid.setAdapter(adap);
    }

    ArrayList<String> getStrings() {
        ArrayList<String> es = new ArrayList<>();
        for(int i=0; i<20; i++){
            es.add(String.valueOf(i));
        }
        return es;
    }
}
