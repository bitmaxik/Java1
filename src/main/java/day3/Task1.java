package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();
            String country;
            if (city.equals("Stop")) {
                break;
            } else {
                switch (city) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        country = "Россия";
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        country = "Италия";
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        country = "Англия";
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        country = "Германия";
                        break;
                    default:
                        country = "Неизвестная страна";
                }
                System.out.println(country);
            }
        }
    }
}