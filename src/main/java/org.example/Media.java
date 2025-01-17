package org.example;

import Media.format.contentProvider;

public class Media{
    private String title;
    private int yearProduced;
    private String director;
    private String producer;
    private String criticRating;
    private int durationMinutes;
    private String audioLanguage;
    private enum Format{
        VINYL, BLURAY, STREAM;
        
        private enum ContentProvider{
            NETFLIX, HULU, DISNEY, AMAZON, APPLE, YOUTUBE;
        }

    }
    
    public Media(String title, int produceOn, Format contentFormat, ContentProvider cp){
            this.title=title;
            this.yearProduced=produceOn;
            this.Format = contentFormat;
            this.ContentProvider=cp;
    } 
}