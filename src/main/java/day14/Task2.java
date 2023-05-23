package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));


    }
    public static List<String> parseFileToStringList(File file){
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
            for(int i = 0; i < list.size(); i++){
                String[] strings = list.get(i).split(" ");
                if(Integer.parseInt(strings[1]) < 0) throw new IOException();
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
            return list;
    }
}
