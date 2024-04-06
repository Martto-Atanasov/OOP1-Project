package Commands;

public class SaveAsFileCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Saving file as...");
        // Logic for saving file as
        System.out.println("File saved as successfully!");
    }
}
