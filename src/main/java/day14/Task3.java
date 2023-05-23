package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));


    }
    public static List<Person> parseFileToObjList(File file){
        List<String> list = new ArrayList<>();
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
            for(int i = 0; i < list.size(); i++){
                String[] strings = list.get(i).split(" ");
                if(Integer.parseInt(strings[1]) < 0) throw new IOException();
                personList.add(new Person(strings[0],Integer.parseInt(strings[1])));
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return personList;
    }
}
