package com.tsystems;

import java.util.ArrayList;

/**
 * This class contains the attributes and methods of an User.
 *
 * @author
 * @version 1.0
 */
public class User {
    private int id;
    private String name;
    private String username;
    private Gender gender;
    private SexualOrientation orientation;
    private String hashedPassword;
    private ArrayList<Interests> hobbies;

    private static int nextId = 1;

    public User (String username, String hashedPassword) {
        this.id             = nextId++;
        this.username       = username;
        this.hashedPassword = hashedPassword;
    }

    /**
     * Constructor method
     *
     * @param name of the user
     * @param gender of the user
     * @param orientation of the user
     * @param hashedPassword of the user
     * @param hobbies is ArryaList of the hobbies
     */
    public User(String name, String username, Gender gender, SexualOrientation orientation, String hashedPassword, ArrayList<Interests> hobbies) {
        this.id = User.nextId++;
        this.name           = name;
        this.username       = username;
        this.gender         = gender;
        this.orientation    = orientation;
        this.hashedPassword = hashedPassword;
        this.hobbies        = hobbies;
    }

    /**
     * getId
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * getName
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public String getUserName() {
        return username;
    }

    /**
     * getHashedPassword
     *
     * @return hashedPassword
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * setName
     * @param name of the user for change
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setHashedPassword
     * @param hashedPassword
     */
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    /**
     *
     * @return
     */
    public Gender getGender() {
        return gender;
    }

    public SexualOrientation getOrientation() {
        return orientation;
    }

    public ArrayList<Interests> getHobbies() {
        return hobbies;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        User o = (User) obj;
        return o.getId() == id && o.getName().equals(name);
    }

}
