package SongLibrary.Model;

public class Song {

    public String name;
    public String artist;
    public String album;
    public int year;

    public Song(){
        this.name="";
        this.artist="";
        this.album="";
        this.year=0;
    }

    public Song(String name, String artist, String album, int year){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.year=year;
    }

    public void editSong(String name, String artist, String album, int year){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.year=year;
    }
}
