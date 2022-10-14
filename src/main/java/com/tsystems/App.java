package com.tsystems;

import java.util.InputMismatchException;


/**
 * The main entrypoint of the application.
 * @version 1.0
 */
public class App
{
    private static UI ui = new UI();
    private static CLInder clinder;

    private static User user         = null;
    private static UserDB userDB     = new UserDB();
    private static UserAuth userAuth = new UserAuth(userDB);


    public static void main( String[] args )
    {
        try {
            userDB.loadDB();
        }
        catch(Exception e) {
            ui.printError(e);
            System.exit(1);
        }

        clinder = new CLInder(userDB.getUsers());

        var option = MenuOptions.NOOP;
        Exception error = null;

        do {
            ui.clearScreen();

            if (error != null) {
                ui.printError(error);
            }

            error  = null;
            option = MenuOptions.NOOP;

            ui.printWelcome();
            ui.printMainMenu();

            try {
                option = ui.readMenuOption();
            }
            catch (InputMismatchException e) {
                error = e;
            }


            switch (option) {
                case EXIT -> {

                }
                case LOGIN -> {

                }
                case REGISTER -> {

                }
            }

        } while (option != MenuOptions.EXIT);
    }
}
