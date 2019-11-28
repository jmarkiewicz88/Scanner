import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter names");
       String[] names = new String[4];
       for (int i = 0; i < 4; i++)
        {
            String newName = input.nextLine();
            names[i] = newName;
        }
        FileWriter fw = new FileWriter("U:\\Test.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < names.length; i++) {
            bw.write(names[i]);
            bw.newLine();
        }
        bw.close();
        System.out.println("done");
    }

}
