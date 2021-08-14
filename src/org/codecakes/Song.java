package org.codecakes;

public class Song {
    private String title;
    private Double duration;

    public Song(String title, Double duration){
        this.title = title;
        this.duration = duration;
    }

    public Double getDuration(){
        return this.duration;
    }

    public String getTitle(){
        return this.title;
    }

}
