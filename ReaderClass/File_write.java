package ReaderClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_write {
    public static void main(String ar[]) throws IOException {
        // InputStreamReader is a bridge from byte streams to character streams
        FileOutputStream f;
        try {
            f = new FileOutputStream("file2.txt", true);
            // f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the content of the file below: ");
        int i;
        do {
            i = br.read();
            f.write((char) i);
        } while ((char) i != '$');
        f.close();
        System.out.println("File written successfully");

    }
}
