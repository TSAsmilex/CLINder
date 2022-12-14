package com.tsystems;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.security.auth.login.LoginException;

/**
 * The systems in charge of handling the login and registration of users.
 * 
 * @version 1.0
 */
public class UserAuth {
    private UserDB userDB;


    public UserAuth(UserDB userDB) {
        this.userDB = userDB;
    }


    public User login (String dni, String password) throws LoginException {
        String hashedPassword = getSHA512(password);

        User user = null;

        try {
            user = userDB.login(dni, hashedPassword);
        }
        catch (LoginException e) {
            throw new LoginException("Incorrect user or/and password");
        }

        return user;
    }


    public User registerUser(String name, String dni, String password) throws LoginException {
        String hashedPassword = getSHA512(password);

        User user = new User(name, dni, hashedPassword);

        if (!userDB.addUser(user)) {
            throw new LoginException("User already exists in the database");
        }

        return user;
    }


    public String getSHA512(String input){

        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}
