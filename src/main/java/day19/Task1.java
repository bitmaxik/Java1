package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "D:" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "dushi.txt";
        File file = new File(path);
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()) {
                String string = scanner.next();
                if (!map.containsKey(string)) {
                    map.put(string, 1);
                } else {
                    map.put(string, map.get(string) + 1);
                }
            }
//            System.out.println(map.get("Чичиков")); Чичиков - 601
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));
            int count = 0;
            for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                if (count == 100) return;
                System.out.println(entry.getKey() + " = " + entry.getValue());
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}