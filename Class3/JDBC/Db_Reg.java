package Class3.JDBC;

import java.util.Scanner;

public class Db_Reg {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Password:");
        String password = sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter Salary:");
        double sal = sc.nextDouble();

        DbCon db = new DbCon();
        try {
            String qry = "insert into emp(name,password,salary) values('" + name + "','" + password + "','" + address
                    + "' " + sal + ")";
            System.out.println(qry);
            db.st.executeUpdate(qry);
            System.out.println("Record Inserted");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
