package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class JBDC_Connection {
    public static void main(String[] args) {
        Connection connection = null;
        try{ connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
            if (connection == null){
                System.out.println("no conection to db");
            }else
                System.out.println("conected to db");

        }
        catch (SQLDataException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                connection.close();
            }
            catch (Exception e){e.printStackTrace();}




        }




    }}