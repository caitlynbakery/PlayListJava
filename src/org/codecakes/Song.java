package org.codecakes;

public class Song {
    private String title;
    private String duration;

    public Song(String title, String duration){
        this.title = title;
        this.duration = duration;
    }

    public String getDuration(){
        return this.duration;
    }

    public String getTitle(){
        return this.title;
    }

}
