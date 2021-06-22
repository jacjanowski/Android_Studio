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

//        dish1.title = "Mushroom and tofu maki";
//        dish1.description = "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu";
//        dish1.price = 999;

        Dish[] dishes = {

                new Dish("Mushroom and tofu maki", "Toasted seaweed wrapped around sushi rice, filled with chestnut mushroom and smoked tofu", 999),
                new Dish("Farfelle with Vodka sauce", "Creamy and rich in California taste", 699),
                new Dish("Sauce puree with Brussels", "Woodland taste", 1299),
                new Dish("Turkey breast", "Gyoza enriched", 199),
                new Dish("Brocolli cheddar", "Cereal", 599),
                new Dish("Sensei sushi", "Fenua paste", 799),
                new Dish("Steak", "pasztet", 1789),
                new Dish("Barbosa beans", "Woodfired brick", 1329),
                new Dish("Breaded Chicken", "Blessed oil", 1559)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}