package Class3.JDBC;

import java.util.Scanner;
import java.util.UUID;

public class Checking {
	public static void main(String []ar) {
		// First we have to find out the if the user is existing with email and number and then push the it into the table of sql
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter Password:");
        String password = sc.nextLine();
        System.out.println("Enter mobile:");
        String mobNo = sc.nextLine();
        
        Dbcon db=new Dbcon();
        try {
        	String checkQuery = "SELECT COUNT(*) FROM emp WHERE `email` = ? OR `mob` = ?";
        	db.pst=db.con.prepareStatement(checkQuery);
        	db.pst.setString(1, email); 
            db.pst.setString(2, mobNo);

            
            db.rs=db.pst.executeQuery();
            db.rs.next();
            int cnt=db.rs.getInt(1);
            if(cnt>0) {
            	System.out.println("User Already Exists with this mail or number");
            }
            else {

            	String e_id=UUID.randomUUID().toString().substring(0, 4);
            	String insertQuery="Insert into emp (e_id, name,email,password,mob) values (?,?,?,?,?)";
            	db.pst=db.con.prepareStatement(insertQuery);
            	db.pst.setString(1,e_id);
                db.pst.setString(2,name);
                db.pst.setString(3, email);
                db.pst.setString(4, password);
                db.pst.setString(5, mobNo);

                int rowsInserted = db.pst.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("User Registered Successfully! Your Employee ID: " + e_id);
                }
            }
            
            
            
        }catch(Exception e){
        	System.out.println(e);
        }
        
        
	}
}
