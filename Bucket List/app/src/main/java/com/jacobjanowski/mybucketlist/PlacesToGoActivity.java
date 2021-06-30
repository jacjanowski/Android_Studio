package com.jacobjanowski.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {

        BucketListEntry[] placesToGo = {

                new BucketListEntry("Vietnam", "Do it the difficult way!", R.drawable.vietnam, 5),
                new BucketListEntry("Kerala, India", "Try varied tea flavours, stay in houseboat", R.drawable.kerala, 5),
                new BucketListEntry("Japan", "Hot springs, sushi, bamboo forest, bullet train through mountains.", R.drawable.japan, 3.5f),
                new BucketListEntry("Iceland", "Dynjandi Waterfall, nature reserves, maybe the Northern Lights", R.drawable.iceland, 5),
                new BucketListEntry("The Amazon, Brazil", "Try to survive being scared by all the creepy crawlies!", R.drawable.amazon, 4.5f),

        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);

    }


}