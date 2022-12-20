import java.util.*;
class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    public Album(String name,String artist)
    {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean addSong(String title,double duration)
    {
        songs.add(new Song(title, duration));

        System.out.println("New Song title is "+title+": "+duration);
        return true;
    }
    public Song findSong(String title)
    {
        for(Song checkedSong: songs)
        {
            if(checkedSong.getTitle().equals(title))
            {
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber,LinkedList<Song> list)
    {
        int index = trackNumber-1;
        if((index>=0) && (index<this.songs.size()))
        {
            list.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not contain track no: "+trackNumber);
        return false;
    }


    public boolean addToPlayList(String title,LinkedList<Song> list)
    {
        Song checkedSong = findSong(title);
        if(checkedSong!=null)
        {
            list.add(checkedSong);
            System.out.println("Song "+title+" added to playlist");
            return true;
        }
        System.out.println("Can not find song");
        return false;
    }

    
}

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

    public String toString(){
        return this.title+": "+this.duration;
    }
}
public class Prac48{
    public static void main(String[] args) {
        
    }
}