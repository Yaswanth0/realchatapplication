package com.example.realchatapplication.service;

public class UserService {
    public boolean userExists (String userName) {
        System.out.println("UserName: " + userName);
        return false;
    }

    public void setUserOnlineStatus(String userName, boolean isOnline){
        if(isOnline){
            System.out.println("user: " + userName + " status updated to online");
        } else {
            System.out.println("user: " + userName + " status updated to offline");
        }
    }
}
