package com.tsystems;

import java.util.InputMismatchException;
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

    public void printMainMenu() {
        MenuOptions.printMenu();
    }

    public void printError(Exception error) {
        System.out.println("Se ha producido error. Motivo: " + error.getMessage());
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public void printWelcome() {
        System.out.println("\n¡Hola! ¿Qué quieres hacer?");
    }

    public MenuOptions readMenuOption() throws InputMismatchException {
        MenuOptions option = MenuOptions.NOOP;

        try {
            System.out.print("> ");
            option = MenuOptions.fromValue(scan.nextInt());
            scan.nextLine();
        }
        catch (InputMismatchException e) {
            scan.nextLine();
            throw new InputMismatchException("Introduce un comando válido.");
        }

        return option;
    }
}
