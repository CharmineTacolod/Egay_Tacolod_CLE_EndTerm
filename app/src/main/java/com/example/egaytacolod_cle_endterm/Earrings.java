package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.egaytacolod_cle_endterm.ListAdapterEarrings;

public class Earrings extends Activity {

    String ListItemsName[] = new String[]{
            "Butterfly Chain",
            "Endless",
            "Geometric",
            "Hardware Link",
            "Heart",
            "Koi Fish",
            "Pearly Shell",
            "Profession Inspired",
            "Sparkle Bow",
            "Victoria"
    };
    Integer ImageName[] = {
            R.drawable.butterfly_chain,
            R.drawable.endless,
            R.drawable.geometric,
            R.drawable.hard_wear_link,
            R.drawable.heart,
            R.drawable.koi_fish,
            R.drawable.pearly_shell,
            R.drawable.profession_inspired,
            R.drawable.sparkle_bow,
            R.drawable.victoria
    };
    ListView listView;
    ListAdapterEarrings listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earrings);

        listView = (ListView)findViewById(R.id.listViewEarrings);

        listAdapter = new ListAdapterEarrings(Earrings.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ButterflyChain.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Endless.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Geometric.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), HardwareLink.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Heart.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}