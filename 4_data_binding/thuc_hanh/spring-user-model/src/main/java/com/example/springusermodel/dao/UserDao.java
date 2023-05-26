package com.example.springusermodel.dao;

import com.example.springusermodel.model.Login;
import com.example.springusermodel.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1= new User("john","123456","John","john@codegym.vn",10);
        users.add(user1);
        User user2= new User("bill","123456","Bill","bill@codegym.vn",15);
        users.add(user2);
        User user3= new User("mike","123456","Mike","mike@codegym.vn",16);
        users.add(user3);
    }
    public static User checkLogin(Login login){
        for (User user:users) {
            if (user.getAccount().equalsIgnoreCase(login.getAccount())
                    && user.getPassword().equalsIgnoreCase(login.getPassword())){
                return user;
            }
        }
        return null;
    }

}
