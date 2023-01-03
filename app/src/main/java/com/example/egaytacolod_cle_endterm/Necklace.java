package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.egaytacolod_cle_endterm.ListAdapterNecklace;

public class Necklace extends Activity {

    String ListItemsName[] = new String[]{
            "Linh",
            "Rose",
            "Green Aventurine Heart",
            "Stem of Flower",
            "Horoscope",
            "Initial",
            "Planet",
            "Four Elements",
            "Sport Themed",
            "Elysee "
    };
    Integer ImageName[] = {
            R.drawable.linh,
            R.drawable.rose,
            R.drawable.green_aventurine,
            R.drawable.stem_of_flower,
            R.drawable.horoscope,
            R.drawable.initial,
            R.drawable.planet,
            R.drawable.four_elements,
            R.drawable.sport_themed,
            R.drawable.elysee
    };
    ListView listView;
    ListAdapterEarrings listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);

        listView = (ListView)findViewById(R.id.listViewNecklace);

        listAdapter = new ListAdapterEarrings(Necklace.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Linh.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Rose.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), GreenAventurineHeart.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}