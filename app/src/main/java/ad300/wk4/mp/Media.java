package ad300.wk4.mp;

public class Media {
    private String title;
    private int yearProduced;
    private String director;
    private String producer;
    private String criticRating;
    private int durationMinutes;
    private String audioLanguage;
    public Format format;
    public ContentProvider contentProvider;

    public enum Format {
        VINYL, BLURAY, STREAM;

    }

    public enum ContentProvider {
        NETFLIX, HULU, DISNEY, AMAZON, APPLE, YOUTUBE, PBS, PRIVATECOLLECTION;
    }

    public Media(String title, int yearProduced, Format format, ContentProvider contentProvider) {
        this.title = title;
        this.yearProduced = yearProduced;
        this.format = format;
        this.contentProvider = contentProvider;
    }
    
    public String getTitle() {
        return this.title;
    }
}
