package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayers<6) countPlayers++;
    }
    public int getStamina(){
        return this.stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }
    public void run(){
        if(this.stamina > MIN_STAMINA) {
            this.stamina--;
            if(this.stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игроку нужен отдых, он покидает поле.");
            }
        }
    }

    public static void info(){
        switch(countPlayers){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + "свободных мест");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                break;
            case 6:
                System.out.println("На поле нет свободных мест");
                break;
        }
    }





}
