package io.examples.designpatterns.composite;

public class DiscJockey {

    SongComponent songList;

    /**
     * newSongList contains every Song, SongGroup, and any Songs saved in SongGroups
     *
     * @param newSongList
     */
    public DiscJockey(SongComponent newSongList) {

        songList = newSongList;

    }

    /**
     * Calls the displaySongInfo() on every Song or SongGroup stored in songList
     */
    public void getSongList() {

        songList.displaySongInfo();

    }
}
