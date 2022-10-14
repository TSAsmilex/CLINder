package com.tsystems;

import java.util.InputMismatchException;

public enum MenuOptions {
    NOOP(0),
    LOGIN(1),
    REGISTER(2),
    EXIT(3);

    private final int value;

    private MenuOptions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuOptions fromValue(int value) {
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }

        throw new InputMismatchException("Invalid option");
    }

    public static void printMenu() {
        System.out.println("   1) Login");
        System.out.println("   2) Registrarme");
        System.out.println("   3) Salir");
    }
}
