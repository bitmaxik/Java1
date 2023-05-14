package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[100];
        int index = 0;
        int sumMax = 0;
        int sum = 0;

        for(int i = 0; i < massive.length; i++){
            massive[i] = random.nextInt(10001);
        }

        for(int i = 0; i < massive.length -2; i++){
            sum = massive[i] + massive[i+1] + massive[+2];
            if(sum > sumMax) {
                sumMax = sum;
                index = i;
            }
            sum = 0;
        }

        System.out.println("Сумма максимальной тройки: " + sumMax);
        System.out.println("Индекс первого элемента тройки: " + index);
    }
}
