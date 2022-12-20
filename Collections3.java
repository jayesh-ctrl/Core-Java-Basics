import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;


// public class Collections3 {

//     private static ArrayList<Album> albums  =new ArrayList<Album>();
//     public static void main(String[] args)
//     {
//         Album album = new Album("Stormbringer", "Deep purple");
//         album.addSong("Stormbringer", 4.6);
//         album.addSong("Love don't mean a thing", 4.22);
//         album.addSong("Holy Man", 4.3);
//         album.addSong("Hold on", 5.6);
//         album.addSong("Lady double dealer", 3.21);
//         album.addSong("You can't do it right", 6.23);
//         album.addSong("High ball shooter", 4.27);
//         album.addSong("The gypsy", 4.2);
//         album.addSong("Soldier of fortune", 3.13);
//         albums.add(album);

//         album = new Album("For those about to rock", "AC/DC");
//         album.addSong("For those about to rock", 5.44);
//         album.addSong("I put the finger on you", 3.25);
//         album.addSong("Lets go", 3.45);
//         album.addSong("Inject the venom",3.33);
//         album.addSong("Snowballed", 4.51);
//         album.addSong("Evil walks", 3.45);
//         album.addSong("C.O.D.", 5.25);
//         album.addSong("Breaking the rules", 5.32);
//         album.addSong("Night of the long knives", 5.12);

//         albums.add(album);

//         LinkedList<Song> playList = new LinkedList<Song>();
//         albums.get(0).addToPlayList("You can't do it right",playList);
//         albums.get(0).addToPlayList("Holy Man",playList);
//         albums.get(0).addToPlayList("Speed King",playList);   // does not exist;
//         albums.get(0).addToPlayList(9,playList);

//         albums.get(1).addToPlayList(8,playList);
//         albums.get(1).addToPlayList(3,playList);
//         albums.get(1).addToPlayList(2,playList);
//         albums.get(1).addToPlayList(6,playList);
//         albums.get(1).addToPlayList(24,playList);

//         play(playList);


//     }
//     private static void play(LinkedList<Song> playList)
//     {
//         ListIterator<Song> listIterator = playList.listIterator();
//         if(playList.size() == 0)
//         {
//             System.out.println("No Songs in playlist");
//             return;
//         }
//         else{
//             System.out.println("Now Playing "+listIterator.next().toString());

//         }

//     }
// }

class Song{
    private String title;
    private double duration;

    public Song(String title,double duration)
    {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle()
    {
        return title;
    }

    public String toString()
    {
        return this.title+": "+this.duration;
    }
}
class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name,String artist)
    {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration)
    {
        if(findSong(title)==null)
        {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title)
    {
        for(Song checkedSong: this.songs)
        {
            if(checkedSong.getTitle().equals(title))
            {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber,LinkedList<Song> playList)
    {
        int index = trackNumber - 1;
        if((index>=0) && (index < this.songs.size()))
        {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song> playList)
    {
        Song checkedSong = findSong(title);
        if(checkedSong != null)
        {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The Song "+title+" is not in this album");
        return false;
    }


}   


public class Collections3 {

    private static ArrayList<Album> albums  =new ArrayList<Album>();
    public static void main(String[] args)
    {
        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom",3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holy Man",playList);
        albums.get(0).addToPlayList("Speed King",playList);   // does not exist;
        albums.get(0).addToPlayList(9,playList);

        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(6,playList);
        albums.get(1).addToPlayList(24,playList);

        play(playList);


    }
    private static void play(LinkedList<Song> playList)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0)
        {
            System.out.println("No Songs in playlist");
            return;
        }
        else{
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                
                case 1:
                if(!forward)
                {
                    if(listIterator.hasNext())
                    {
                        listIterator.next();
                    }
                    forward = true;

                }
                if(listIterator.hasNext())
                {
                    System.out.println("Now Playing " + listIterator.next().toString());
                }
                else
                {
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
                    break;

                case 2:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now Playing "+listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are at Starting of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Now Replaying "+listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else{
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                
                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Now Playing "+listIterator.next());
                        }
                        else if(listIterator.hasPrevious())
                        {
                            System.out.println("Now Playing "+listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu()
    {
        System.out.println(("Available actions:\npress"));
        System.out.println("0 - to quit\n"+"1 - to play next song\n"+"2 - to play previous song\n"+"3 - to replay the current song\n"+"4 - list songs in playlist\n"+"5 - print available actions\n");
    }

    private static void printList(LinkedList<Song> playList)
    {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }
}