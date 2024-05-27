package Commands;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class SaveAsFileCommand implements Command{
    @Override
    public void execute() {
        String oldFileName = OpenFileCommand.getFileName();
        Scanner fileScanner = OpenFileCommand.getFileScanner();

        if (oldFileName == null || fileScanner == null) {
            System.out.println("No file is currently open.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine().trim();

        try {
            Files.copy(Paths.get(oldFileName), Paths.get(newFileName));
            try (FileWriter fileWriter = new FileWriter(newFileName, true)) {
                while (fileScanner.hasNextLine()) {
                    fileWriter.write(fileScanner.nextLine() + "\n");
                }
            }
            System.out.println("File saved as " + newFileName + " successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to save file.");
        }
    }
}
