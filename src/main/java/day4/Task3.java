package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] massive = new int[12][8];

        int sum;
        int sumMax = 0;
        int index = 0;

        for(int i = 0; i < massive.length; i++){
            sum = 0;
            for(int j = 0; j < massive[i].length; j++){
                massive[i][j] = random.nextInt(51);
                System.out.print(massive[i][j] + " ");
                sum += massive[i][j];
            }
            System.out.print( "сумма: " + sum);
            System.out.println();
            if(sum >= sumMax){
                sumMax = sum;
                index = i;
            }
        }

        System.out.println("Индекс строки с максимальной суммой: " + index);

    }
}
