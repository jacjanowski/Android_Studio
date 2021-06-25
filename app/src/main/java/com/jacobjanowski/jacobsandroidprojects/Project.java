package com.jacobjanowski.jacobsandroidprojects;

public class Project {

    String name;
    String description;
    //R.drawable.name_of_the_file (this will be some sort of 'int' number).
    int image;

    Project(String name, String description, int image){
        this.name = name;
        this.description = description;
        this.image = image;
    }


}
