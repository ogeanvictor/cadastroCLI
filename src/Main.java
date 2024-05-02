import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/utils/questions.txt");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}