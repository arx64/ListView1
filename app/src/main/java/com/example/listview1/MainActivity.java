package com.example.listview1;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("Galaxy S4", "Samsung"));
        list.add(new Phone("Galaxy S3", "Samsung"));
        list.add(new Phone("Galaxy Mega", "Samsung"));
        list.add(new Phone("Galaxy Note", "Samsung"));
        list.add(new Phone("Iphone", "Apple"));
        list.add(new Phone("HTC One", "HTC"));
        list.add(new Phone("Nexus 5", "LG"));
        list.add(new Phone("Nexus 4", "LG"));
        list.add(new Phone("LG G2", "LG"));
        list.add(new Phone("Moto x", "Motorola"));
        ListAdapter adapter = new ListAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(adapter); }
}