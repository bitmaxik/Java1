package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Aerosmith", 1970);
        MusicBand musicBand2 = new MusicBand("Metallica", 1981);
        MusicBand musicBand3 = new MusicBand("Blur", 1988);
        MusicBand musicBand4 = new MusicBand("Guano Apes", 1994);
        MusicBand musicBand5 = new MusicBand("Muse", 1994);
        MusicBand musicBand6 = new MusicBand("Boomkat", 2003);
        MusicBand musicBand7 = new MusicBand("Katana", 2003);
        MusicBand musicBand8 = new MusicBand("BWO", 2004);
        MusicBand musicBand9 = new MusicBand("Intronaut", 2004);
        MusicBand musicBand10 = new MusicBand("Daughtry", 2006);
        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(musicBand1,musicBand2,musicBand3,musicBand4,musicBand5,musicBand6,musicBand7,musicBand8,musicBand9,musicBand10));
        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000) groupsAfter2000.add(band);
        }
        return groupsAfter2000;
    }
}
