package com.tsystems;

import java.util.InputMismatchException;

/**
 * Possible option to be chosen by the user on the main menu.
 * @version 1.0
 */
public enum MenuOptions {
    NOOP(0),
    LOGIN(1),
    REGISTER(2),
    EXIT(3);

    private final int value;

    /**
     * Creates a new MenuOption from a given value.
     * @param value
     */
    private MenuOptions(int value) {
        this.value = value;
    }

    /**
     * Returns the value of the option.
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * Converts from an integer to a MenuOption.
     * @param value The value to be converted to a MenuOption.
     * @return The corresponding option.
     * @throws InputMismatchException If the value is not a valid option.
     */
    public static MenuOptions fromValue(int value) {
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }

        throw new InputMismatchException("Invalid option");
    }

    /**
     * Prints the possible values for the options.
     */
    public static void printMenu() {
        System.out.println("   1) Login");
        System.out.println("   2) Registrarme");
        System.out.println("   3) Salir");
    }
}
