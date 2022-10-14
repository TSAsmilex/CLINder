/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tsystems;

import java.util.InputMismatchException;

import javax.naming.ldap.ManageReferralControl;

/**
 *
 * @author ramaldon, TSAsmilex
 */
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    NONBINARY("NONBINARY");

    private final String value;

    private Gender(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static Gender fromString(String value) {
        for (var gender : Gender.values()) {
            if (gender.toString().equals(value)) {
                return gender;
            }
        }

        throw new InputMismatchException("Invalid option");
    }
}
