package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;
    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }
    public String getUsername() {
        return username;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        if(subscriptions.contains(user)) return true;
                    else{
                return false;
            }
        }
    public boolean isFriend(User user){
        if((isSubscribed(user)) && user.isSubscribed(this)) return true;
        else {
            return false;
        }
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user,text);
    }
    public String toString(){
        return this.username;
    }
}

