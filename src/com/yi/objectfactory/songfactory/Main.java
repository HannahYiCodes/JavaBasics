package com.yi.objectfactory.songfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Song Factory\n\n");

        String songTitle = UI.readString("What is the song's title?");
        String songArtist = UI.readString("Who is the song's artist?");
        String songGenre = UI.readString("What is the song's genre?");
        int songLength = UI.readInt("How many seconds is the song?", 0, 1000000);

        Song generateSong = new Song(songTitle, songArtist, songGenre, songLength);
        System.out.println(generateSong);
    }
}
