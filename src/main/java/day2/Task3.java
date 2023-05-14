package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int myInt = a +1;

        if(a >= b){
            System.out.println("Некорректный ввод");
        } while (myInt < b){
            if( myInt % 5 == 0 && myInt % 10 != 0){
                System.out.print(myInt + " ");
            }
            myInt++;
        }
    }
}
