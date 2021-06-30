package com.jacobjanowski.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {

        BucketListEntry[] thingsToDo = {

          new BucketListEntry("Climb Mt Kilimanjaro", "Do it the difficult way!", R.drawable.kilimanjaro,5),
          new BucketListEntry("Experience the Northern Lights", "Somewhere in the arctic circle, probably Norway", R.drawable.northern_lights,4.5f),
          new BucketListEntry("Road Trip Through USA", "Hire a car from the west coast, and travel to the east coast.", R.drawable.road_trip,2.5f),
          new BucketListEntry("Scuba Dive", "In Koh Tao, Thailand.", R.drawable.scubadive,3.2f),
          new BucketListEntry("Skydive", "Preferably over somewhere with an amazing view.", R.drawable.skydive,4),

        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);

    }


}