package org.codecakes;

import java.util.ArrayList;

public class Main {
    static ArrayList<Album> albumArrayList = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here


        loadData();
        Playlist playlist = new Playlist(albumArrayList);
       printAlbumLibrary();
    }

    public static void loadData(){
        Album helloFuture = new Album("Hello Future");
    helloFuture.addSong(new Song("Rocket", "2:56"));
        helloFuture.addSong(new Song("Bungee", "3:29"));
        helloFuture.addSong(new Song("Diggity", "3:30"));
        albumArrayList.add(helloFuture);

        Album freeze = new Album("Chaos Chapter: Freeze");
        freeze.addSong(new Song("Anti-Romantic", "3:36"));
        freeze.addSong(new Song("Magic", "2:40"));
        freeze.addSong(new Song("Lovesong", "3:23"));
        albumArrayList.add(freeze);
    }

    public static void printAlbumLibrary(){
        System.out.println("Printing all the album songs");
        System.out.println("-------------------");
        for(int i = 0; i< albumArrayList.size(); i++){
            System.out.println("Album " + albumArrayList.get(i).getAlbumName());
            albumArrayList.get(i).printSongs();
            System.out.println("");
        }
    }

    public static void menuOfOptions(){
        System.out.println("List of Options:");
        System.out.println("0 - quit");

    }
}
