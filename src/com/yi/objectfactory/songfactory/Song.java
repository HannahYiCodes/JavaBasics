package com.yi.objectfactory.songfactory;

public class Song {
    private String songTitle;
    private String songArtist;
    private String songGenre;
    private int songLength;

    public Song(String songTitle, String songArtist, String songGenre, int songLength) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songGenre = songGenre;
        this.songLength = songLength;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public int getSongLength() {
        return songLength;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", songArtist='" + songArtist + '\'' +
                ", songGenre='" + songGenre + '\'' +
                ", songLength=" + songLength +
                '}';
    }
}
