package com.player.audio.izacs.audioplayer;

import android.graphics.Bitmap;

public class Song {

    private long id;
    private String title;
    private String artist;
    private Bitmap coverImage;

    public Song(long songID, String songTitle, String songArtist, Bitmap artwork) {
        id=songID;
        title=songTitle;
        artist=songArtist;
        coverImage = artwork;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public Bitmap getCover(){return coverImage;}

}
