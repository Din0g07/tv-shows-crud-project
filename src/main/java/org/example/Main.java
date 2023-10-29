package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.xml.transform.Result;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        SessionFactory sessionFactory = new Configuration().buildSessionFactory();

        

//        Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
//                "postgres", "dinosaur007");
//
//        Statement statement = connect.createStatement();
//        ResultSet result = statement.executeQuery("SELECT * From test_table");
//        while(result.next()) {
//            int id = result.getInt(1);
//            String friendName = result.getString(2);
//            System.out.println(id + ". " + "\t" + friendName);
//        }
    }
}