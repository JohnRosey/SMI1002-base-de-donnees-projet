package com.smi1002;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public static void  main(String[] args ){
        try{
//step1 load the driver class
            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

//step2 create  the com.smi1002.connection object
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@172.16.25.43:1521/coursbd.uqtr.ca","Your_user_name","Your_password");//"jdbc:oracle:thin:@172.16.25.43:1521/coursbd.uqtr.ca","SMI1002_011","47qmus53");

//step3 create the statement object
            Statement stmt=con.createStatement();

//step4 execute query
            ResultSet rs=stmt.executeQuery("select * from FILM");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the com.smi1002.connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
