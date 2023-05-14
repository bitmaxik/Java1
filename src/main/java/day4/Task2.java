package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[100];
        for(int i = 0; i < massive.length; i++){
            massive[i] = random.nextInt(10001);
        }
        int max = massive[0];
        int min = massive[0];
        int zeroEndNumbers = 0;
        int sumZeroEndNumbers = 0;

        for(int x: massive){
            if(x>max) max = x;
            if(x<min) min = x;
            if(x%10 == 0){
                zeroEndNumbers++;
                sumZeroEndNumbers += x;
            }
        }
    }
}
