package com.batson_java_course_2021.Week_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        String url = "jdbc:mysql://45.33.14.177/example";
        try {
            Connection conn = DriverManager.getConnection(url, "dev", "devpass");
            System.out.println("success");

            Statement statement = conn.createStatement();

            ResultSet results = statement.executeQuery("select customer.name, customerorder.product from customer left join customerorder on customer.id = customerorder.cust_id");

            List<Customer> customers = new ArrayList<Customer>();

            while (results.next()) {
                String name = results.getString(1);
                String product = results.getString(2);

                System.out.println(name + " ordered " + product);
            }


            conn.close();
        } catch (SQLException ex) {
            System.out.println("error! " + ex.getMessage());
        }
    }
}