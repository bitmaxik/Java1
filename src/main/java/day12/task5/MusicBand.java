package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members ) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Группа " + this.name + " - год основания " + this.year ;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
            musicBand2.getMembers().addAll(musicBand1.members);
            musicBand1.getMembers().clear();
        }
    public void printMembers(){
        System.out.println(this.getMembers());
    }
}
