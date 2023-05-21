package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Kia", "Audi","Honda","Tesla", "BMW"));
        System.out.println(list);
        list.add(2, "Lada");
        list.remove(0);
        System.out.println(list);
    }
}
