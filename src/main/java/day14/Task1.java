package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String stringNumbers[] = scanner.nextLine().split(" ");
            scanner.close();
            if(stringNumbers.length != 10){
                   throw new IOException();
            }
            int counters = 0;
            int[] numbers = new int[10];
            for (String number : stringNumbers) {
                numbers[counters++] = Integer.parseInt(number);
                sum += numbers[--counters];
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
