package org.codecakes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> songLinkedList = new LinkedList<>();

    public Playlist(ArrayList<Album> albums){
        this.albumArrayList = albums;

    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }

    public void addSong(Song song){
        System.out.println("adding song");
        songLinkedList.add(song);
    }
}
