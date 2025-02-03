package ReaderClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String ar[]) throws IOException {
        // InputStreamReader is a bridge from byte streams to character streams
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter first number: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Enter second number: ");
        int j = Integer.parseInt(br.readLine());
        System.out.println("The sum of the numbers is: " + (i + j));

    }
}
