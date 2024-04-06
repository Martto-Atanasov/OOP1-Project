package Commands;

public class SaveFileCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Saving file...");
        // Logic for saving file
        System.out.println("File saved successfully!");
    }
}
