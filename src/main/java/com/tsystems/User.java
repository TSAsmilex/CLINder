package com.tsystems;


public class User {
    private String name;
    private String hashedPassword;

    private static int id = 0;

    public User(String name, String dni, String hashedPassword){
        this.id++;
        this.name = name;
        this.hashedPassword=hashedPassword;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        User o = (User) obj;
        return o.getId() == id && o.getName().equals(name);
    }

}
