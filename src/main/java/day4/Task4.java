package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[100];
        int index = 0;
        int sumMax = 0;
        int sum = 0;
        int countSumElements = 3;

        for(int i = 0; i < massive.length; i++){
            massive[i] = random.nextInt(10001);
        }

        for(int i = 0; i < massive.length - (countSumElements - 1); i++){
            for(int j = 0; j < countSumElements; j++){
                sum += massive[i+j];
            }
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
