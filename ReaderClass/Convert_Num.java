
// Input an integer and convert it to binary and hexadecimal using while loop and array 
package ReaderClass;

import java.util.Scanner;

import Sunny.S;

public class Convert_Num {

    private static String convertToHexa(int num) {
        int[] hexNum = new int[100];
        int i = 0;
        while (num != 0) {
            hexNum[i] = num % 16;
            num = num / 16;
            i++;

        }
        String hex = "";
        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9) {
                hex += (char) (55 + hexNum[j]);
            } else {
                hex += hexNum[j];
            }
            // System.out.println("hexNum[j]: " + hexNum[j]);
        }
        return hex;
    }

    private static String converToBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = num % 2 + binary;
            num = num / 2;
        }
        return binary;
    }

    public static void main(String ar[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        // For Binary
        String binary = converToBinary(num);

        System.out.println("Binary: " + binary);

        // For Hexadecimal

        String hexaCodeVal = convertToHexa(num);
        System.out.println("Hexadecimal: " + hexaCodeVal);

    }

}
