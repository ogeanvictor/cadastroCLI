import Resources.ReadFile;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new ReadFile();
        readFile.fileReader("src/utils/questions.txt");
    }
}