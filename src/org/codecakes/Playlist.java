package org.codecakes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> songLinkedList = new LinkedList<>();

    public Playlist(ArrayList<Album> albumArrayList){
this.albumArrayList = albumArrayList;
    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }

    public void addSong(Song song){
        if(checkSong(song.getTitle()) == null){
            System.out.println("Song does not appear in album");
        }else{
            System.out.println("adding song");
            songLinkedList.add(song);
        }

    }

    private Song checkSong(String songName){
        for(int i = 0; i<albumArrayList.size(); i++){
            Album album = albumArrayList.get(i);
            for(int j = 0; j<album.getSongArrayList().size(); j++){
                if(songName.equals(album.getSongArrayList().get(j).getTitle())){
                    return album.getSongArrayList().get(j);
                }
            }

        }
        return null;
    }

    public void printPlaylist(){
        for(int i = 0; i< songLinkedList.size(); i++){
            System.out.println(songLinkedList.get(i).getTitle() + " at duration " + songLinkedList.get(i).getDuration());
        }
    }
}
