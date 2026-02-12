import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderUtil {

    public static String readFile(String filePath) throws IOException {
        Path path = Path.of(filePath);

        if (!Files.exists(path)) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        return Files.readString(path);
    }
}
