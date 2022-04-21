package coursbd.uqtr.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectionBD {
    public static void connect() {
        try{
            System.out.println("Connexion à la base de données en cours...");

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@172.16.25.43:1521/coursbd.uqtr.ca","SMI1002_011","47qmus53");


            Statement stmt=con.createStatement();

System.out.println("Connexion réussie");
System.out.println("Voici une donnee de la base de données");
            ResultSet rs=stmt.executeQuery("select * from FILM");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

            con.close();

        }catch(Exception e){ System.out.println(e);}




    }
}
