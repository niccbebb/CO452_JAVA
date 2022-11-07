package SongsApp;
import java.util.ArrayList;

public class SongsApp 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 5 Java Revision & Quiz ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Songs music0 = new Songs();
        music0.Songs("title1",  "artist1", 6);

        Songs music1 = new Songs();
        music1.Songs("title2",  "artist2", 20);

        Songs music2 = new Songs();
        music2.Songs("Wow",  "Tion Wayne", 60000000);

        Songs music3 = new Songs();
        music3.Songs("title3",  "artist3", 100);

        Songs music4 = new Songs();
        music4.Songs("title4",  "artist4", 2000);

        Songs music5 = new Songs();
        music5.Songs("title5",  "artist5", 600);
        
        ArrayList<Songs> tunes = new ArrayList<>();

        tunes.add(music0);

        tunes.add(music1);

        tunes.add(music3);

        tunes.add(music4);

        tunes.add(music5);
        
        System.out.println("Menue:");
        System.out.println("1 = Print list of song");
        System.out.println("2 = Add a new song");
        System.out.println("3 = Remove a song");
        System.out.println("4 = Print a list of songs over a given number of plays");
        int name = InputReader.getInt("Choose an option from the menue:");

        if(name == 1)
        {
            for(Songs obj : tunes)
            {
                System.out.println(" ");
                obj.print();
            }
        }
        else if(name == 2)
        {
            String inputTiltle = InputReader.getString("Please enter the title of the song: ");
            String inputArtist = InputReader.getString("Please enter the Artist name: ");
            int inputPlays = InputReader.getInt("Please enter the number of plays: ");

            Songs inputSong = new Songs();
            inputSong.Songs(inputTiltle, inputArtist, inputPlays);

            tunes.add(inputSong);

            for(Songs obj : tunes)
            {
                System.out.println(" ");
                obj.print();
            }
        }
        else if(name == 3)
        {
            for(Songs obj : tunes)
            {
                System.out.println(" ");
                obj.print();
            }
            String removedSongs = InputReader.getString("Please enter the name of the song you'd like to remove: ");

            for(Songs obj : tunes)
            {
                if(removedSongs.equals(obj.getTitle()))
                {
                    tunes.remove(obj);
                }

                for(Songs song : tunes)
                {
                    System.out.println(" ");
                    song.print();
                }

            }
        }
        else if(name == 4)
        {
            int minimumPlays = InputReader.getInt("Please enter the minimum number of plays: ");


            for(Songs obj : tunes)
            {
                if(minimumPlays < obj.getPLays())
                {
                    System.out.println(" ");
                    obj.print();
                }
            }
        }
    } 

}
