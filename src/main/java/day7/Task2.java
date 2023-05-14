package day7;


import java.util.Random;

import static day7.Player.MIN_STAMINA;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomStamina = random.nextInt(191)+90;
        Player player1 = new Player(randomStamina);
        Player player2 = new Player(randomStamina);
        Player player3 = new Player(randomStamina);
        Player player4 = new Player(randomStamina);
        Player player5 = new Player(randomStamina);
        Player player6 = new Player(randomStamina);

        Player.info();

        Player player7 = new Player(randomStamina);
        Player player8 = new Player(randomStamina);

        System.out.println(Player.getCountPlayers());

        for(int i = player1.getStamina(); i> MIN_STAMINA; i--){
            player1.run();
        }
        Player.info();
        System.out.println(Player.getCountPlayers());

    }
}
