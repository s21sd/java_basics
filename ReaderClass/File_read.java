package ReaderClass;

import java.io.FileInputStream;

import Sunny.S;

public class File_read {
    public static void main(String ar[]) {
        FileInputStream f;
        try {
            f = new FileInputStream("file2.txt");

            int i;
            int cnt = 0;
            do {
                i = f.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
                if ((char) i == '\n') {  // Find the number of lines in the file
                    cnt++;
                }
            } while (i != -1);
            System.out.println(cnt);
            f.close();

        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }

    }
}

// Copy the content of one file to another file ✅
// Find the number of lines in the file ✅
// Input marks from user ranging from zero to thundred if 75-100 then grade A,
// 50-74 grade B, 35-49 grade C, 0-34 grade D if <0 or >100 then throw an
// exception MarksOutOfRangeException ✅
// Input an integer and convert it to binary and hexadecimal using while loop and array 