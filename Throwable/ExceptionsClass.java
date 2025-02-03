// Throwable package is used to handle exceptions in Java
// we have Exception class and Error class in Throwable package
// In Exception we have more than 480 exception -> ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException, FileNotFoundException, IOException, InterruptedException, NoSuchMethodException, NullPointerException, NumberFormatException, RuntimeException, etc.
// Error -> AssertionError, ExceptionInInitializerError, StackOverflowError, NoClassDefFoundError, OutOfMemoryError, NoSuchMethodError etc.

// Exception has two types: Checked Exception and Unchecked Exception
// Unchecked Exception -> Occurs on a statement for a particular value may or may not occur

// Checked Exception -> Occurs on a process and it will occur for sure
package Throwable;

import java.util.Scanner;

public class ExceptionsClass {
    public static void main(String[] args) {
        // unchecked exception
        // try {
        // int a = 10;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero");
        // }

        // // checked exception -> always occurs
        // try {
        // Class.forName("Throwable.ExceptionsClass");
        // } catch (ClassNotFoundException e) {
        // System.out.println("Class not found");
        // }

        // throw-> It is used to explicitly throw an exception
        // throws -> It is used to declare that a method might throw one or more
        // exceptions.
        // We can use Throwable class to handle all the exceptions

        // try {
        // int i = 10;
        // int j = 0;
        // int ans = i / j;
        // System.out.println(ans);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array index out of bound" + e.getMessage());
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero" + e);
        // } catch (Throwable e) {
        // System.out.println("Parent exception occurs");
        // }
        // // finally{
        // // System.out.println("Finally block");
        // // }
        // // catch (Exception e) {
        // // System.out.println("Parent exception occurs");
        // // }
        // finally {
        // System.out.println("Finally block");
        // }

        // Take a string input from the user and check if the string is your name if it
        // show then print or else throw an exception NoMatchException

        String name = "";
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        if (name.equals("Sunny")) {
            System.out.println("Name is correct");
        } else {
            try {
                throw new NoMatchException("No match Exception");
            } catch (NoMatchException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
