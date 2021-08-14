package org.codecakes;

import java.util.ArrayList;
import java.util.List;

public class Album {
   private ArrayList<Song> songArrayList;

    public Album(ArrayList<Song> songs){
        this.songArrayList = songs;
    }

    public ArrayList<Song> getSongArrayList(){
        return this.songArrayList;
    }
}
