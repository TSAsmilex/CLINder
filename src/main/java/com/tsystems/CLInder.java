/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsystems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * CLInder class. This class is the logic business manager. It manages a HashMap
 * of users registered in the application and it matchs each user with a Priority
 * Queue of users following his individual interests.
 *
 * @author JCCG-code
 * @version 1.0
 */
public class CLInder {
    private HashSet<User> users = new HashSet<>();

    /**
    * Empty constructor of CLInder class
    */
    public CLInder(HashSet<User> users) {
        this.users = users;
    }

    /**
    * Getter of the user PriorityQueue.
    *
    * @param userSession
    * @return A PriorityQueue of an specific user
    */
    public PriorityQueue<User> possibleMatches(User userSession) {
        //return this.getUserMapSession().get(userSession);
    }
}
