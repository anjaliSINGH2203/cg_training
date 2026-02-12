import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderUtilTest {

    @TempDir
    Path tempDir;

    @Test
    void testReadingValidFile() throws IOException {
        Path file = tempDir.resolve("a.txt");
        Files.writeString(file, "Hello");
        assertEquals("Hello", FileReaderUtil.readFile(file.toString()));
    }

    @Test
    void testMissingFileScenario() {
        Path missing = tempDir.resolve("missing.txt");
        assertThrows(FileNotFoundException.class, () -> FileReaderUtil.readFile(missing.toString()));
    }

    @Test
    void testEmptyFile() throws IOException {
        Path empty = tempDir.resolve("empty.txt");
        Files.writeString(empty, "");
        assertEquals("", FileReaderUtil.readFile(empty.toString()));
    }
}
