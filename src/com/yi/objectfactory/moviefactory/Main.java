package com.yi.objectfactory.moviefactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        String movieTitle = UI.readString("What is the movie's title?");
        String movieDirector = UI.readString("Who is the movie's director?");
        float runtimeInMin = UI.readFloat("What is the movie's runtime in minutes?", 0, 5000);
        boolean hasBeenReleased = UI.readBoolean("Has this movie been released?");

        Movie generatedMovie = new Movie(movieTitle, movieDirector, runtimeInMin, hasBeenReleased);
        System.out.println(generatedMovie);
    }
}
