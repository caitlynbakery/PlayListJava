package org.codecakes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Album> albumArrayList = new ArrayList<>();
        Playlist playlist = new Playlist(albumArrayList);
        playlist.addSong(new Song("Hello Future", 2.31));
        playlist.addSong(new Song("Boss", 3.21));
    }
}
