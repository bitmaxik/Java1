package day4;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int countBiggerEight = 0;
        int countEqualOne = 0;
        int countEvenNumber = 0;
        int countOddNumber = 0;
        int sum = 0;
        int number = scanner.nextInt();
        int[] massive = new int[number];
        for(int i = 0; i < massive.length; i++){
            massive[i] = random.nextInt(11);
        }
        for(int x: massive){
            System.out.print(x + " ");
            sum += x;
            if(x > 8) countBiggerEight++;
            if(x == 1) countEqualOne++;
            if(x % 2 == 0) countEvenNumber++;
            if(x % 2 != 0) countOddNumber++;
        }

        System.out.println("Длина массива: " + massive.length);
        System.out.println("Количестве чисел больше 8: " + countBiggerEight);
        System.out.println("Количестве чисел равных 1: " + countEqualOne);
        System.out.println("Количество четных чисел: " + countEvenNumber);
        System.out.println("Количество нечетных чисел: " + countOddNumber);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
