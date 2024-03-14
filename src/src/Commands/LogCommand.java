package Commands;

public class LogCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Log selected");
    }
}
