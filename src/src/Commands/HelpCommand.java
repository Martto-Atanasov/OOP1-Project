package Commands;
import Menus.SubMenu;
public class HelpCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Help Menu:");
        SubMenu subMenu = new SubMenu();
        subMenu.run();
    }
}
