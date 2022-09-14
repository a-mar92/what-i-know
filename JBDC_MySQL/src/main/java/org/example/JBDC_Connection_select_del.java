package org.example;

import java.sql.*;

public class JBDC_Connection_select_del {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sqlSelect;
        String sqlInsert;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
            if (connection == null) {
                System.out.println("no conection to db");
            } else
                System.out.println("conected to db");
            statement = connection.createStatement();
            sqlInsert = "INSERT INTO employees (name, adress, salary) VALUES" +
                    "('Krzysztof' , 'katowice', 2000),"
                    + "('Mikałaj' , 'Wojkowice', 1500)";
            statement.executeUpdate(sqlInsert);
            sqlSelect = "SELECT  * FROM    employees;";
            resultSet = statement.executeQuery(sqlSelect);
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
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                resultSet.close();
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