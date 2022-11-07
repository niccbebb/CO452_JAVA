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

        music5.print();

        for(Songs obj : tunes)
        {
            System.out.println(" ");
            obj.print();
        }

        /*
        tunes.add(music6);

        tunes.add(music7);

        tunes.add(mustic8);
        */


        /* 
        music0.addSong ("Wow", "Tion Wayne", 4483921);
        music.addSong ("Sicko Mode", "Travis Scott", 2556875);
        music.addSong ("Floss", "AJ Tracey", "4,865,234");
        music.addSong ("War", "ArrDee", "2,345,622");
        music.addSong ("Retail Therapy", "Central Cee", "6,224,734");
        music.addSong ("Go", "Cat Burns", "3,333,222");
        music.addSong ("La Nota", "Manuel Turizo", "4,234,765");
        music.addSong ("Sidelines", "Lecrae", "1,643,775");
        music.addSong ("Moscow Mule", "Bad Bunny", "5,763,231");
        music.addSong ("Vagas", "Doja Cat", "2,343,986");
        
        System.out.println(music);

        System.out.println("Welcome to SongsApp! Please choose an option from the menue ");
        System.out.println("Menue:");
        System.out.println("1 = Print list of song");
        System.out.println("2 = Add a new song");
        System.out.println("3 = Remove a song");
        System.out.println("4 = Print a list of songs over a given number of plays");
        */
    } 

}
