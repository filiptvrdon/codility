package sk.filiptvrdon.io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static final Path PATH = Paths.get("src/main/resources/input.txt");

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.printFileLines(PATH);

    }


}
