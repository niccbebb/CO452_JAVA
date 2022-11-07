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
        System.out.println(this.title);
        System.out.println(this.artist);
        System.out.println(this.plays);
    }
}
