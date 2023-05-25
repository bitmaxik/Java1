package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file  =new File("text");
        printResult(file);

    }
    public static void printResult(File file){
        int sum = 0;
        int counter = 0;
        List<Integer> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt())  {
                list.add(scanner.nextInt());
            }
            for (Integer numbers: list){
                sum += numbers;
                counter++;
            }

            double arithmetic = (double)sum / counter;
            System.out.printf(arithmetic + " --> %.3f", arithmetic);










        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

