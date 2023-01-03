package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.egaytacolod_cle_endterm.ListAdapterWatch;

public class Watch extends Activity {

    String ListItemsName[] = new String[]{
            "Vintage Leather",
            "Quadro",
            "Iconic Link",
            "Classic",
            "Petite",
            "CT-60",
            "East West",
            "Markers Square",
            "Markers Square Leather",
            "Atlas"
    };
    Integer ImageName[] = {
            R.drawable.vintage,
            R.drawable.quadro,
            R.drawable.iconiclink,
            R.drawable.classic,
            R.drawable.petite,
            R.drawable.ct,
            R.drawable.eastwest,
            R.drawable.markersquare,
            R.drawable.square,
            R.drawable.atlas
    };
    ListView listView;
    ListAdapterWatch listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);

        listView = (ListView)findViewById(R.id.listViewWatch);

        listAdapter = new ListAdapterWatch(Watch.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Vintage.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Quadro.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}