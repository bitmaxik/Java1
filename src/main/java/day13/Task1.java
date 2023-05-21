package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Tom");
        User user3 = new User("Mark");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "У меня все хорошо");
        user2.sendMessage(user1, "А как у тебя?");
        user3.sendMessage(user1, "О, ты где пропадал?!");
        user3.sendMessage(user1, "Чем занимался?");
        user3.sendMessage(user1, "Давно тебя не было!");
        user1.sendMessage(user3, "Работы много навалило");
        user1.sendMessage(user3, "А потом отпуск был");
        user1.sendMessage(user3, "Как вы тут, все нормально было?");
        user3.sendMessage(user1, "Да, все хорошо");

        MessageDatabase.showDialog(user1,user3);


    }
}
