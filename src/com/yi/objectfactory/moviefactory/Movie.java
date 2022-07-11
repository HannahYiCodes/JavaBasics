package com.yi.objectfactory.moviefactory;

public class Movie {
    private String movieTitle;
    private String movieDirector;
    private float runtimeInMin;
    private boolean hasBeenReleased;

    public Movie(String movieTitle, String movieDirector, float runtimeInMin, boolean hasBeenReleased) {
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
        this.runtimeInMin = runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public float getRuntimeInMin() {
        return runtimeInMin;
    }

    public boolean isHasBeenReleased() {
        return hasBeenReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", movieDirector='" + movieDirector + '\'' +
                ", runtimeInMin=" + runtimeInMin +
                ", hasBeenReleased=" + hasBeenReleased +
                '}';
    }
}
