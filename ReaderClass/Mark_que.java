// Input marks from user ranging from zero to thundred if 75-100 then grade A,
// 50-74 grade B, 35-49 grade C, 0-34 grade D if <0 or >100 then throw an
// exception MarksOutOfRangeException
package ReaderClass;

import java.util.Scanner;

public class Mark_que {
    public static void main(String ar[]) throws MarksOutOfRangeException {
        int marks;
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("MarksOutOfRangeException");
        } else if (marks >= 75 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("Grade B");
        } else if (marks >= 35 && marks <= 49) {
            System.out.println("Grade C");
        } else if (marks >= 0 && marks <= 34) {
            System.out.println("Grade D");

        }

    }
}
