package org.codecakes;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static ArrayList<Album> albumArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here


        loadData();
        Playlist playlist = new Playlist(albumArrayList);
        // printAlbumLibrary();
        playlist.addSong(new Song("Rocket", "2:56"));
        playlist.addSong(new Song("Magic", "2:40"));
        playlist.addSong(new Song("Anti-Romantic", "3:36"));
        playlist.addSong(new Song("Diggity", "3:30"));
        playlist.addSong(new Song("Bungee", "3:29"));
        playlist.printPlaylist();
        menuOfOptions();
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playlist.getSongLinkedList().listIterator();
        System.out.println("Currently playing " + listIterator.next().getTitle());
        while (!quit) {
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    //next
                    if (listIterator.hasNext()) {


                        if (!goingForward) {

                            listIterator.next();
                            System.out.println("current song is " + listIterator.next().getTitle());
                            goingForward = true;
                        } else {
                            System.out.println("current song is " + listIterator.next().getTitle());
                        }
                    } else {
                        System.out.println("You've reached the end of the list");
                    }

                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        if (goingForward) {

                            listIterator.previous();
                            if (listIterator.hasPrevious()) {

                                System.out.println("current song is " + listIterator.previous().getTitle());

                            }else {
                                System.out.println("At beginning of list");
                            }


                            goingForward = false;
                        } else {

                            System.out.println("current song is " + listIterator.previous().getTitle());


                        }
                    } else {
                        System.out.println("You've reached the start of the list");
                    }


                    break;
                case 3:
                    if (goingForward) {
                        listIterator.previous();
                        System.out.println("playing " + listIterator.next().getTitle());
                    } else {
                        listIterator.next();
                        System.out.println("playing " + listIterator.previous().getTitle());
                    }
                    break;
                case 4:
                    playlist.printPlaylist();
                    break;
                case 5:

                    System.out.println("removing song");
                    listIterator.remove();

                    //does not work :(
                    if (!goingForward) {
                        if (listIterator.hasPrevious()) {
                            //going backwards and has previous
                            System.out.println("BACKWARDS AND HAS PREVIOUS");
                            System.out.println("playing " + listIterator.previous().getTitle());


                        } else {
                            //going backwards and at start of list
                            System.out.println("BACKWARDS AND START OF LIST");
                            listIterator.next();
//                            System.out.println("playing " + listIterator.next().getTitle());
                            System.out.println("playing " + listIterator.previous().getTitle());


                        }

                    } else {
                        if (listIterator.hasNext()) {
                        //going forwards and has next
                            System.out.println("Going forwards and has next");
                            System.out.println("playing " + listIterator.next().getTitle());
                        } else {
                            //going forwards and at end of list
                            System.out.println("Going forwards and at end of list");
                            listIterator.previous();
                            System.out.println("playing " + listIterator.next().getTitle());

                        }

                    }
            }
        }

    }

    public static void loadData() {
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

    public static void printAlbumLibrary() {
        System.out.println("Printing all the album songs");
        System.out.println("-------------------");
        for (int i = 0; i < albumArrayList.size(); i++) {
            System.out.println("Album " + albumArrayList.get(i).getAlbumName());
            albumArrayList.get(i).printSongs();
            System.out.println("");
        }
    }

    public static void menuOfOptions() {

        System.out.println("List of Options:");
        System.out.println("0 - quit");
        System.out.println("1 - skip forward");
        System.out.println("2 - skip backwards");
        System.out.println("3 - replay the current song");
        System.out.println("4 - print playlist");
        System.out.println("5 - remove current song");
    }
}
