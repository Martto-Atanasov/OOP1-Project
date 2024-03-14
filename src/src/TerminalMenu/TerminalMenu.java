package TerminalMenu;

import Commands.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminalMenu {
    private final Map<String, Command> menuOptions = new HashMap<>();
    private final Scanner scanner;

    public TerminalMenu() {
        scanner = new Scanner(System.in);
        menuOptions.put("1", new PrintCommand());
        menuOptions.put("2", new AddCommand());
        menuOptions.put("3", new RemoveCommand());
        menuOptions.put("4", new LogCommand());
        menuOptions.put("5", new CleanCommand());
    }

    public void run() {
        String userInput;
        do {
            displayMenu();
            userInput = scanner.nextLine().trim();
            if (menuOptions.containsKey(userInput)) {
                menuOptions.get(userInput).execute();
            } else if (!userInput.equalsIgnoreCase("exit")) {
                System.out.println("Invalid option. Please try again.");
            }
        } while (!userInput.equalsIgnoreCase("exit"));
    }

    private void displayMenu() {
        System.out.println("Terminal Menu: ");
        System.out.println("1. Print");
        System.out.println("2. Add");
        System.out.println("3. Remove");
        System.out.println("4. Log <from>  <to>)");
        System.out.println("5. Clean");
        System.out.println("Type 'exit' to quit.");
        System.out.print("Enter your choice: ");
    }
}

