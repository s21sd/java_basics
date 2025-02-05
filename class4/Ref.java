import java.lang.reflect.*;
public class Ref {
    public static void main(String[] ar) {
        try {
            Class c = Class.forName("java.awt.Button");
            Constructor con[] = c.getConstructors();
            
            // method
            for (int i = 0; i < con.length; i++) {
                System.out.println(con[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
