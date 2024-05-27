package Commands;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class SaveFileCommand implements Command{
    private String content;


    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void execute() {

            String fileName = OpenFileCommand.getFileName();
            Scanner fileScanner = OpenFileCommand.getFileScanner();

            if (fileName == null || fileScanner == null) {
                System.out.println("No file is currently open.");
                return;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new content to save to the file:");
            String newContent = scanner.nextLine();

            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(newContent + "\n");
                System.out.println("File saved successfully!");
            } catch (IOException e) {
                System.out.println("Error: Unable to save file.");
            }
    }
}
