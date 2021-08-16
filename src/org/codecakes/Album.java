package org.codecakes;

import java.util.ArrayList;
import java.util.List;

public class Album {
   private ArrayList<Song> songArrayList = new ArrayList<>();
   private String albumName;

    public Album(String albumName){
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongArrayList(){
        return this.songArrayList;
    }

    public void addSong(Song song){
        songArrayList.add(song);
    }

    public String getAlbumName(){
        return this.albumName;
    }

    public void printSongs(){
        for(int i = 0; i< songArrayList.size(); i++){
            System.out.println(songArrayList.get(i).getTitle() + " has duration " + songArrayList.get(i).getDuration());
        }
    }
}
