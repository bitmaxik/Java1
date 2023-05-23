package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "D:" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "shoes.csv";
        String pathNewFile = separator + "D:" + separator + "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt";
        File file = new File(path);
        File fileMissingShoes = new File(pathNewFile);
        fileMissingShoes.getParentFile().mkdirs();

        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter(fileMissingShoes);
            while (scanner.hasNextLine()){
                list.add(scanner.nextLine());
            }
            for(int i = 0; i < list.size(); i++){
                if(Integer.parseInt(list.get(i).split(";")[2]) == 0){
                    System.out.println(list.get(i));
                    printWriter.println(list.get(i));
                }
            }
            printWriter.close ();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
