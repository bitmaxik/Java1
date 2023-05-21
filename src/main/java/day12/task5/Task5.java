package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Band", 1995, new ArrayList<>(Arrays.asList(new MusicArtist("Tom", 1990), new MusicArtist("Bob", 1980))));
        MusicBand musicBand2 = new MusicBand("BandNew", 1990, new ArrayList<>(Arrays.asList(new MusicArtist("Mark", 1989), new MusicArtist("Alex", 1970))));

        MusicBand.transferMembers(musicBand1,musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
