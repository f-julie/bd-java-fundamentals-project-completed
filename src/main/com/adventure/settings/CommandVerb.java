package main.com.adventure.settings;

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
        CommandVerb command;
        if ("TAKE".equalsIgnoreCase(verbString)) {
            command = TAKE;
        } else if ("MOVE".equalsIgnoreCase(verbString)) {
            command = MOVE;
        } else if ("USE".equalsIgnoreCase(verbString)) {
            command = USE;
        } else if ("DIG".equalsIgnoreCase(verbString)) {
            command = DIG;
        } else if ("EXAMINE".equalsIgnoreCase(verbString)) {
            command = EXAMINE;
        } else if ("LOOK".equalsIgnoreCase(verbString)) {
            command = LOOK;
        } else if ("HELP".equalsIgnoreCase(verbString)) {
            command = HELP;
        } else if ("FIGHT".equalsIgnoreCase(verbString)) {
            command = FIGHT;
        } else if ("INVENTORY".equalsIgnoreCase(verbString)) {
            command = INVENTORY;
        } else {
            return INVALID;
        }
        return command;
    }
}
