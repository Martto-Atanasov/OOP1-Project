package Commands;

public class CloseFileCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Saving file...");
        // Logic for saving file
        System.out.println("File saved successfully!");
    }
}
