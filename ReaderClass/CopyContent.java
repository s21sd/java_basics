// ques1 Copy the content of file2.txt to file3.txt
package ReaderClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyContent {
    public static void copyTheContent(FileInputStream f1, FileOutputStream f2) {
        try {
            int i;
            do {
                i = f1.read();
                if (i != -1) {
                    f2.write((char) i);
                }
            } while (i != -1);
            f1.close();
            f2.close();
            System.out.println("File copied successfully");
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }
    }

    public static void main(String ar[]) {

        FileInputStream f1;
        FileOutputStream f2;
        try {
            f1 = new FileInputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");
            copyTheContent(f1, f2);
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }
    }
}
