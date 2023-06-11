package calc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите выражение для вычисления: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(calc(inputString));

    }

    public static String calc(String input) {
        int result = 0;
        String resultStr = "";
        String[] stringNumbers = input.split(" ");
        List<String> arabDigits = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
        List<String> romanDigits = new ArrayList<>(Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
        List<String> signs = new ArrayList<>(Arrays.asList("+", "-", "/", "*"));
        String check = "";
        if (stringNumbers.length != 3) {
            try {
                throw new IllegalArgumentException("Количество введенных элементов не равно трем");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if (!signs.contains(stringNumbers[1])) {
            try {
                throw new IllegalArgumentException("Введен некорректный арифметический оператор");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if (!(arabDigits.contains(stringNumbers[0]) && arabDigits.contains(stringNumbers[2]) ||
                romanDigits.contains(stringNumbers[0]) && romanDigits.contains(stringNumbers[2]))) {
            try {
                throw new IllegalArgumentException("Введены некорректные аргументы");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if (arabDigits.contains(stringNumbers[0]) && arabDigits.contains(stringNumbers[2])) {
            int firstNumber = Integer.parseInt(stringNumbers[0]);
            int secondNumber = Integer.parseInt(stringNumbers[2]);
            check = "Arab";
            switch (stringNumbers[1]) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
        } else if (romanDigits.contains(stringNumbers[0]) && romanDigits.contains(stringNumbers[2])) {
            int firstNumber = Roman.valueOf(stringNumbers[0]).getArabNumber();
            int secondNumber = Roman.valueOf(stringNumbers[2]).getArabNumber();
            check = "Roman";
            switch (stringNumbers[1]) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
        }
        if (check.equals("Arab")) {
            resultStr = Integer.toString(result);
        } else if (check.equals("Roman")) {
            StringBuilder resultRoman = new StringBuilder();
            if (result < 1) try {
                throw new IllegalArgumentException("Результат операции с римскими числами меньше 1");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            else if (result == 100) {
                resultRoman.append("C");
            } else if (result < 40) {
                resultRoman.append("X".repeat(result / 10));
                result %= 10;
                for (Roman roman : Roman.values()) {
                    if (roman.getArabNumber() == result)
                        resultRoman.append(roman.name());
                }
            } else if (result == 40) {
                resultRoman.append("XL");
            } else if (result < 50) {
                resultRoman.append("XL");
                result -= 40;
                for (Roman roman : Roman.values()) {
                    if (roman.getArabNumber() == result)
                        resultRoman.append(roman.name());
                }
            } else if (result < 90) {
                resultRoman.append("L");
                result -= 50;
                resultRoman.append("X".repeat(result / 10));
                result %= 10;
                for (Roman roman : Roman.values()) {
                    if (roman.getArabNumber() == result)
                        resultRoman.append(roman.name());
                }
            } else if (result == 90) {
                resultRoman.append("XC");
            } else if (result > 90) {
                resultRoman.append("XC");
                result -= 90;
                resultRoman.append("X".repeat(result / 10));
                result %= 10;
                for (Roman roman : Roman.values()) {
                    if (roman.getArabNumber() == result)
                        resultRoman.append(roman.name());
                }
            }
            resultStr = resultRoman.toString();
        }
        return resultStr;
    }
}

