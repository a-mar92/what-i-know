package org.example;

import java.sql.*;

public class JDBC_DEL {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String insertSQL;
        String selectSQL;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
            if (connection == null) {
                System.out.println("filed conection to db");
            } else {
                System.out.println("conected to db");
            }
            statement = connection.createStatement();
            insertSQL = "INSERT INTO employees (name,adress,salary) VALUES" +
                    "('wACEK','pilzno',2000),"+
            "('Zygmunt','KATOWICE',123123)"
            ;

            statement.executeUpdate(insertSQL);

            selectSQL = "(SELECT * FROM employees WHERE id >10)";
            resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String adress = resultSet.getString("adress");
                int salary = resultSet.getInt("salary");
                System.out.println("id:" + id + ", name: " + name + ", adress : " + adress + ", salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

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
