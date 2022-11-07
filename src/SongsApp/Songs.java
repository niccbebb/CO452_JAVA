package SongsApp;

public class Songs
{
    private String title;
    private String artist;
    private int plays;

    public void Songs(String title, String artist, int plays)
    {
        this.title = title;
        this.artist = artist;
        this.plays = plays;
    }

    public void print()
    {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Plays: " + this.plays);
    }

    public int getPLays()
    { 
        return plays;
    }

    public String getTitle()
    {
        return title;
    }
}
