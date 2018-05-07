package com.example.brom.listviewjsonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bergdetaljer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bergdetaljer);

        Bundle extras = getIntent().getExtras();

        String name = extras.getString("bergnamn");
        String location = extras.getString("bergplats");
        String height = extras.getString("berghojd");

        TextView namn = (TextView) findViewById(R.id.bergNamn);
        TextView hojd = (TextView) findViewById(R.id.bergHojd);
        TextView plats = (TextView) findViewById(R.id.bergPlats);


        namn.setText(name);
        hojd.setText(height);
        plats.setText(location);
    }
}
