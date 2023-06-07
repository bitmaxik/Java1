package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "D:" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "taxi_cars.txt";
        File file = new File(path);
        Map<Integer, Point> map = new HashMap<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] numbers;
                numbers = scanner.nextLine().split(" ");
                int firstInt = Integer.parseInt(numbers[0]);
                int secondInt = Integer.parseInt(numbers[1]);
                int thirdInt = Integer.parseInt(numbers[2]);
                map.put(firstInt, new Point(secondInt, thirdInt));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4 целых числа: ");
        int[] numbersGetTaxi = new int[4];
        for (int i = 0; i < 4; i++) {
            numbersGetTaxi[i] = scanner.nextInt();
        }
        Point point1 = new Point(numbersGetTaxi[0], numbersGetTaxi[1]);
        Point point2 = new Point(numbersGetTaxi[2], numbersGetTaxi[3]);
        int counterTaxi = 0;

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            int x = entry.getValue().getX();
            int y = entry.getValue().getY();

            if (((getTaxi(x, point1.getX(), point2.getX()))) &&
                    ((getTaxi(y, point1.getY(), point2.getY())))) {
                System.out.println(entry.getKey());
                counterTaxi++;
            }
        }
        if (counterTaxi > 0) System.out.println("В указанном квадрате находится " + counterTaxi + " такси");
        else {
            System.out.println("В указанном квадрате нет такси");
        }
    }

    public static boolean getTaxi(int entry, int point1, int point2) {
        return ((entry < point1 && entry > point2) || (entry > point1 && entry < point2));
    }
}