package io.examples.designpatterns.composite;

public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newReleaseYear) {
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getBandName() + " was recorded by " +
                getBandName() + " in " + getReleaseYear());
    }

}
