package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.egaytacolod_cle_endterm.ListAdapterRings;

public class Ring extends Activity {

    String ListItemsName[] = new String[]{
            "Round Plain",
            "Flower Themed",
            "Sun and Moon",
            "Moon Phase",
            "Promise",
            "Signet",
            "Wedding",
            "Yinyang Friendship",
            "Love Knot",
            "Infinity "
    };
    Integer ImageName[] = {
            R.drawable.roundplain,
            R.drawable.flower_themed,
            R.drawable.sunmoon,
            R.drawable.moonphase,
            R.drawable.promise,
            R.drawable.signet,
            R.drawable.wedding,
            R.drawable.yinyang_friendship,
            R.drawable.loveknot,
            R.drawable.infinity
    };
    ListView listView;
    ListAdapterEarrings listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);

        listView = (ListView)findViewById(R.id.listViewNecklace);

        listAdapter = new ListAdapterEarrings(Ring.this , ListItemsName, ImageName);

        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), RoundPlain.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), FlowerThemed.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}