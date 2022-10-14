/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsystems;

import java.util.InputMismatchException;

/**
 *
 * @author ramaldon
 */
public enum SexualOrientation {
    HETEROSEXUAL("HETEROSEXUAL"),
    HOMOSEXUAL("HOMOSEXUAL"),
    BISEXUAL("BISEXUAL");

    private final String value;

    private SexualOrientation(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static SexualOrientation fromString(String value) {
        for (var orientation : SexualOrientation.values()) {
            if (orientation.toString().equals(value)) {
                return orientation;
            }
        }

        throw new InputMismatchException("Invalid option");
    }
}
