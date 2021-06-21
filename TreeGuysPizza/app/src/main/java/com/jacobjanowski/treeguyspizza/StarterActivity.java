package com.jacobjanowski.treeguyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish dish1 = new Dish("Mushroom and tofu maki","Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu", 999);
//        dish1.title = "Mushroom and tofu maki";
//        dish1.description = "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu";
//        dish1.price = 999;

        String[] dishes = {
                "Mushroom and tofu maki",
                "Egg and avocado uramaki",
                "Melon and lemon soup",
                "Coconut and chocolate mousse",
                "Spinach and cabbage wontons",
                "Broccoli and cucumber soup",
                "Chilli and aubergine dip",
                "Chickpea and chilli gyoza",
                "Sprout and pineapple soup",
                "Egusi and borscht soup",
                "Aubergine and egg sushi",
                "Artichoke and mustard soup",
                "Peppercorn and tamarind soup",
                "Parsley and celeriac parcels",
                "Pasta and broccoli soup",
                "Potato and courgette soup",
                "Chickpea and cabbage parcels",
                "Coriander and peppercorn gyoza",
                "Pear and chestnut soup",
                "Pesto and garam masala parcels"
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}