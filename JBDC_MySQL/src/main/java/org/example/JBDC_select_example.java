package org.example;

import java.sql.*;

public class JBDC_select_example {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
            if (connection == null) {
                System.out.println("no conection to db");
            } else {
                System.out.println("conected to db");
            }
            statement = connection.createStatement();
            sql = "SELECT * FROM  employees;";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String adress = resultSet.getString("adress");
                int salary = resultSet.getInt("salary");
                System.out.println("id:" + id + ", name: " + name + ", adress : " + adress + ", salary: " + salary);
            }

        } catch (SQLDataException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }
}