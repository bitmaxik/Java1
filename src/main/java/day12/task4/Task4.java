package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("Group", 2000, new ArrayList<>(Arrays.asList("Nod", "dasd")));
        MusicBand musicBand1 = new MusicBand("MusicGroup", 1995, new ArrayList<>(Arrays.asList("Member1", "Member2")));

        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand.printMembers();
        musicBand1.printMembers();
    }
}
