package Menus;
import Commands.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class SubMenu {
    private final Map<String, Command> subMenuOptions = new HashMap<>();
    private final Scanner scanner;

    public SubMenu() {
        scanner = new Scanner(System.in);
        subMenuOptions.put("add", new AddCommand());
        subMenuOptions.put("remove", new RemoveCommand());
        subMenuOptions.put("log<from> <to>", new LogCommand());
        subMenuOptions.put("clean", new CleanCommand());
    }

    public void run() {
        String userInput;
        do {
            displaySubMenu();
            userInput = scanner.nextLine().trim();
            if (subMenuOptions.containsKey(userInput)) {
                subMenuOptions.get(userInput).execute();
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        } while (!userInput.equalsIgnoreCase("exit"));
    }

    private void displaySubMenu() {
        System.out.println("Sub Menu:");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Log <from> <to>");
        System.out.println("4. Clean");
        System.out.println("Type 'exit' to go back.");
        System.out.print("Enter your choice: ");
    }
}
