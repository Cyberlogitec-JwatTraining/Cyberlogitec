package com.cyberlogitec.jwat.springbootmybatis;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
//          Class.forName("oracle.jdbc.driver.OracleDriver");
            String jdbUrl = "jdbc:oracle:thin:@192.168.56.2:1521:orcl";
            connection = DriverManager.getConnection(jdbUrl, "hr", "hr");
            System.out.println("Connection to database initialed!");

            Statement stmt = connection.createStatement();
//		StringBuilder query = new StringBuilder("create table abc (ssn varchar(10) primary key)");
            ResultSet rs = stmt.executeQuery("select * from employees");
            rs.next();
            System.out.println(rs.getString(1) + " " + rs.getString(2));
            rs.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
