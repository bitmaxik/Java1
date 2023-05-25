package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path1 = separator + "D:" + separator + "JavaMarathon2021" + separator + "file1.txt";
        String path2 = separator + "D:" + separator + "JavaMarathon2021" + separator + "file2.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        file1.getParentFile().mkdirs();
        file2.getParentFile().mkdirs();
        Random random = new Random();
        int countGroup = 20;

        try {
            PrintWriter printWriter = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++){
                printWriter.print(random.nextInt(101) + " ");
            }
            printWriter.close();
            Scanner scanner = new Scanner(file1);
            String[] numbers = scanner.nextLine().split(" ");
            scanner.close();
            int sum = 0;
            PrintWriter printWriter1 = new PrintWriter(file2);
            for (int i = 0; i < numbers.length-countGroup;i += countGroup){
                for(int j = 0; j < countGroup; j++ ){
                    sum += Integer.parseInt(numbers[j+i]);
                }
                printWriter1.print((double) sum/countGroup + " ");
                sum = 0;
            }
            printWriter1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        printResult(file2);
    }
    public static void printResult(File file){
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String stringNumbers[] = scanner.nextLine().split(" ");
            scanner.close();
            for (String number: stringNumbers){
                sum += Double.parseDouble(number);
            }
            System.out.println((int)sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
