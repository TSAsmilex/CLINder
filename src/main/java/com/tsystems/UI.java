package com.tsystems;

import java.util.Scanner;

public class UI {
    public Scanner scan = new Scanner(System.in);

    public String readNIF () {
        System.out.println("What's your NIF?");
        System.out.print("> ");
        String dni = scan.nextLine();
        return dni;
    }

    public String readPassword() {
        System.out.println("Password for user: ");
        System.out.print("> ");
        String password = scan.nextLine();
        return password;
    }

    public String readName() {
        System.out.println("What's your name?");
        System.out.print("> ");
        String name = scan.nextLine();
        return name;
    }


}
