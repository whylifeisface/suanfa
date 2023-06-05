package s;
// java 考试题

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathTest {
    public static void main(String[] args) {
        Path pile = Path.of("./test.text");
        try {
            if (!Files.exists(pile)){
                Files.createFile(pile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
