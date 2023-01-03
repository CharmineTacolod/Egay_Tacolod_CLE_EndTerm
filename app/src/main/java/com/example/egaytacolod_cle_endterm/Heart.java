package com.example.egaytacolod_cle_endterm;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Heart extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    String[] metal = { "Gold", "Silver", "Rose Gold"};
    String[] design = { "Rose Quartz(pink)", "Tiger's Eye(yellow-ish)"};
    String result;
    int val1, val2, materials, cost, labor, packaging;
    double constant, wholesale, retail, overhead, costprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);

        Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, metal);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter1);
        spin1.setOnItemSelectedListener(this);

        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, design);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter2);
        spin2.setOnItemSelectedListener(this);

        Button btnCompute = (Button) findViewById(R.id.btnCompute);

        btnCompute.setOnClickListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), "Selected: "+metal[position],Toast.LENGTH_SHORT).show();
        if (position == 0) {
            val1 = 2000;
        }

        if (position == 1) {
            val1 = 1000;
        }

        if (position == 2) {
            val1 = 1500;
        }

        Toast.makeText(getApplicationContext(), "Selected: "+design[position] ,Toast.LENGTH_SHORT).show();
        if (position == 0) {
            val2 = 500;
        }

        if (position == 1) {
            val2 = 300;
        }

        if (position == 2) {
            val2 = 400;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Calculating....", Toast.LENGTH_SHORT).show();
        CalculatingResult();
    }

    public void CalculatingResult(){
        materials = val1 + val2;
        packaging = 300;
        labor = 1200;
        constant = 1.5;
        overhead = .10;
        cost = materials + labor + packaging;
        costprice = cost * overhead;
        wholesale = (cost + costprice) * constant;
        retail = wholesale * constant;

        result = "The Wholesale Price of Item is " + wholesale + " and the Retail Price of Item is " + retail + ".";

        // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
        Bundle args = new Bundle();
        args.putString("result", result);

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
        // Reset EditTexts
    }
}