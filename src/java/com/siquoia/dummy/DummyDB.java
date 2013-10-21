/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.dummy;

import com.siquoia.model.Player;
import com.siquoia.model.User;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class DummyDB {
    private HashMap<Long, User> users;
    private static DummyDB instance;
    
    public static DummyDB getInstance(){
        if(instance == null)
            instance = new DummyDB();
        return instance;
    }
    
    private DummyDB(){
        users = new HashMap<Long, User>();
        setup();
    }
    
    private void setup(){
        users.put(0L, new Player("player0", "password0", "player0@email.com", 0, "paying", "Patrick", "Grønbæch", "Christensen"));
    }
    
    public User getUser(long id){
        return users.get(id);
    }
    
    public User getUser(String userName){
        for(User user : users.values()){
            if(user.getUserName().equalsIgnoreCase(userName))
                return user;
        }
        return null;
    }
}
