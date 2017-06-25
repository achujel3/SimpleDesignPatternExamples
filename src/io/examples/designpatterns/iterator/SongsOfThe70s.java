package io.examples.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {

    // ArrayList holds SongInfo objects

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<SongInfo>();

        addSong("Image", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased) {

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }

    // Get rid of this
    // Return the ArrayList filled with SongInfo Objects

    public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
