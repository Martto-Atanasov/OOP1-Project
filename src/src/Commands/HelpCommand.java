package Commands;
import Menus.SubMenu;
public class HelpCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Help Menu:");
        // Initialize the smaller menu
        SubMenu subMenu = new SubMenu();
        subMenu.run();
    }
}
