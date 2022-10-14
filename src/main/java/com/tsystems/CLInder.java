/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsystems;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author juacuadr
 */
public class CLInder {
    private HashMap<User, PriorityQueue<Interests>> userMapSession;

    public CLInder() {
        this.userMapSession = new HashMap<>();
    }

    public HashMap<User, PriorityQueue<Interests>> getUserMapSession() {
        return userMapSession;
    }
}
