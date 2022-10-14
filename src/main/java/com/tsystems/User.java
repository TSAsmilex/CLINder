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
    private Gender gender;
    private SexualOrientation orientation;
    private String hashedPassword;
    private ArrayList<Interests> hobbies;

    private static int nextId = 1;

    /**
     * Default constructor method
     */
    public User() {

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
    public User(String name, Gender gender, SexualOrientation orientation, String hashedPassword, ArrayList<Interests> hobbies) {
        this.id = User.nextId++;
        this.name = name;
        this.gender = gender;
        this.orientation = orientation;
        this.hashedPassword = hashedPassword;
        this.hobbies = hobbies;
    }

    /**
     *getId is method get
     * @return id
     */
    public int getId() {
        return id;
    }

        /**
     *getName is method get
     * @return name
     */
    public String getName() {
        return name;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

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
