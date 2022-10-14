package com.tsystems;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * {@code UI} handles printing to {@code System.out} and reading from
 * {@code System.in}.
 */
public class UI {
    public Scanner scan = new Scanner(System.in);

    /**
     *
     * @deprecated
     */
    public String readNIF () {
        System.out.println("What's your NIF?");
        System.out.print("> ");
        String dni = scan.nextLine();
        return dni;
    }

    /**
     * Asks the user to write their password and reads a string from {@code System.in}.
     * @return The password written by the user.
     */
    public String readPassword() {
        System.out.println("¿Cuál es tu contraseña?");
        System.out.print("> ");
        String password = scan.nextLine();
        return password;
    }

    /**
     * Asks the user to write their username and reads a string from {@code System.in}.
     * @return The username written by the user.
     */
    public String readName() {
        System.out.println("¿Cómo te llamas?");
        System.out.print("> ");
        String name = scan.nextLine();
        return name;
    }

    /**
     * Prints the possible options to be chosen by the user on the main menu.
     */
    public void printMainMenu() {
        MenuOptions.printMenu();
    }

    /**
     * Prints the message from a certain error.
     * @param error The error to be printed.
     */
    public void printError(Exception error) {
        System.out.println("Se ha producido error. Motivo: " + error.getMessage());
    }

    /**
     * Clears the screen.
     * @see {@link https://stackoverflow.com/questions/2979383/how-to-clear-the-console}
     */
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    /**
     * Prints a welcome message.
     */
    public void printWelcome() {
        System.out.println("\n¡Hola! ¿Qué quieres hacer?");
    }

    /**
     * Reads an integer from {@code System.in} and converts it to a {@code MenuOption}.
     * @return The option chosen by the user.
     * @throws InputMismatchException
     */
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
