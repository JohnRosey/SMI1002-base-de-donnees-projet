package coursbd.uqtr.ca;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionBD {

    private static final String URL = "jdbc:oracle:thin:@172.16.25.43:1521/coursbd.uqtr.ca";
    private static final String USER = "SMI1002_011";
    private static final String PASSWORD = "47qmus53";
    static Connection connection = null;


    public static Connection getConnection() {

        if(connection == null) {
            try {
                System.out.println("Connexion à la base de données en cours...");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println("Connexion réussie");
        }
        return connection;
    }


    /*public static void connect() {
        try{


            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con= DriverManager.getConnection(
                    "","","");


            //Statement stmt=con.createStatement();


System.out.println("Voici une donnee de la base de données");
           // ResultSet rs=stmt.executeQuery("select * from FILM");
            //while(rs.next())
                //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));



        }catch(Exception e){ System.out.println(e);}




    }*/
}
