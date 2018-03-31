package com.example.labirin.bodymassindex;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

// Tab for calculate
        TabSpec tabone = tabHost.newTabSpec("Calculation");
        tabone.setIndicator("Calculation");
        Intent satuIntent = new Intent(this, FirstActivity.class);
        tabone.setContent(satuIntent);

// Tab for information
        TabSpec tabtwo = tabHost.newTabSpec("Information");
        // setting Title and Icon for the Tab
        tabtwo.setIndicator("Information");
        Intent duaIntent = new Intent(this, SecondActivity.class);
        tabtwo.setContent(duaIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(tabone); // Adding calculate tab
        tabHost.addTab(tabtwo); // Adding information tab

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}