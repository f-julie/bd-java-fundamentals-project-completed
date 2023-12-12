package main.com.adventure.settings;

import java.util.Scanner;

/**
 * Sprint 2 Module 3
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 2 Module 3
    FIGHT,
    //Used in Sprint 3 Module 1
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        if ("TAKE".equalsIgnoreCase(verbString)){
            return TAKE;
        } else if ("MOVE".equalsIgnoreCase(verbString)){
            return MOVE;
        } else if ("USE".equalsIgnoreCase(verbString)){
            return USE;
        } else if ("DIG".equalsIgnoreCase(verbString)){
            return DIG;
        } else if ("EXAMINE".equalsIgnoreCase(verbString)) {
            return EXAMINE;
        } else if ("LOOK".equalsIgnoreCase(verbString)) {
            return LOOK;
        } else if ("HELP".equalsIgnoreCase(verbString)) {
            return HELP;
        } else if ("FIGHT".equalsIgnoreCase(verbString)) {
            return FIGHT;
        } else if ("INVENTORY".equalsIgnoreCase(verbString)) {
            return INVENTORY;
        } else return INVALID;
    }
}
