package Class3.JDBC;

public class Retrive {
    public static void main(String[] ar) {
        DbCon db = new DbCon();
        try {
            db.st.executeQuery("select * from table1");
            db.md = db.rs.getMetaData();
            int c = db.md.getColumnCount();
            for (int i = 1; i <= c; i++) {
                System.out.print("\t" + db.md.getColumnLabel(i));
            }
            System.out.println();
            int n = 0;
            while (db.rs.next()) {
                n++;
                for (int i = 1; i <= c; i++) {
                    System.out.print("\t" + db.rs.getString(i));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
