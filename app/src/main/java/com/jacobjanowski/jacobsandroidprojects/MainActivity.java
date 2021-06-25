package com.jacobjanowski.jacobsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app.", R.drawable.getting_started),
                new Project("Quotes", "Making a simple change to the layout, with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters (my own personal calculator app made on my own).", R.drawable.tape),
                new Project("Restaurant App", "A menu app for a fictional restaurant learning about Activites, Classes & Objects, Arrays, Intents, and ListViews", R.drawable.restaurant)


        };
    }

}