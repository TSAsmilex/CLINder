/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 *
 * @author juacuadr
 */
public enum Interest {
    MUSIC("MUSIC"),
    MOVIE("MOVIE"),
    SPORT("SPORT"),
    TRAVEL("TRAVEL"),
    READ("READ"),
    DRAW("DRAW"),
    PHOTOGRAPHY("PHOTOGRAPHY"),
    ANIMALS("ANIMALS"),
    PARTIES("PARTIES"),
    GAMES("GAMES"),
    TECHNOLOGY("TECHNOLOGY"),
    OUTFIT("OUTFIT");

    private final String value;

    private Interest(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static Interest fromString(String value) {
        for (var interest : Interest.values()) {
            if (interest.toString().equals(value)) {
                return interest;
            }
        }

        throw new InputMismatchException("Invalid option");
    }

    public static ArrayList<Interest> parseInterestList(String interestsString) {
        interestsString.trim();

        var listInterests = Arrays.asList(interestsString.split(","));
        var cosa = listInterests.stream()
            .filter(i -> !i.isBlank())
            .map(i -> Interest.fromString(i));

    }
}
