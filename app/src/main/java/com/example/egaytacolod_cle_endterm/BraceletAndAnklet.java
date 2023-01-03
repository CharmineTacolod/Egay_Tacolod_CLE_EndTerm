package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.egaytacolod_cle_endterm.ListAdapterBraceletAnklet;

public class BraceletAndAnklet extends Activity {

    String ListItemsName[] = new String[]{
            "Jordan Anklet",
            "Alhambra Bracelet",
            "Layered Charm Anklet",
            "Four season Bracelet",
            "Double Chain Anklet",
            "Butterfly-Charm Bracelet",
            "Surfer Chic Anklet",
            "Pearl Bead Bracelet",
            "Bead Anklet",
            "Link Bracelet "
    };
    Integer ImageName[] = {
            R.drawable.jordan,
            R.drawable.alhambra,
            R.drawable.layeredcharm,
            R.drawable.fourseason,
            R.drawable.doublechain,
            R.drawable.butterflycharm,
            R.drawable.surferchic,
            R.drawable.friendshippear,
            R.drawable.bead,
            R.drawable.link
    };
    ListView listView;
    ListAdapterEarrings listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet_and_anklet);

        listView = (ListView)findViewById(R.id.listViewBraceletAnklet);

        listAdapter = new ListAdapterEarrings(BraceletAndAnklet.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Jordan.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Alhambra.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}