import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandler {

    public void writeFile() throws FileOperationException{
        try {
            Files.write(Paths.get( "/media/user/volume_d2/Work/Aston/Java/beginner_course/module_03/hw_files/files/test.txt"),
                    "Hello, World\n".getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            throw new FileOperationException("Failed to write file", e);
        }
    }
}
