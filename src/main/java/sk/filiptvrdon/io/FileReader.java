package sk.filiptvrdon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public String readFile(Path path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    public void printFileLines(Path path) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        }
    }


}