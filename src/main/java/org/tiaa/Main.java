package org.tiaa;

import java.sql.*;

public class Main {

    private static String CONNECTION_URL = "jdbc:spark://127.0.0.1:5588";
    private static String DRIVER_CLASS="com.simba.spark.jdbc41.Driver";

    public static void main(String[] args) throws Exception {
        Connection connection = connectViaDM();
        Statement stmt = connection.createStatement();
        String sql = "select * from weathercql.daily";
        ResultSet rs = stmt.executeQuery(sql);
        printResults(rs);
        rs.close();
        stmt.close();
        connection.close();
    }

    private static Connection connectViaDM() throws Exception
    {
        Connection connection = null;
        Class.forName(DRIVER_CLASS);
        connection = DriverManager.getConnection(CONNECTION_URL);
        return connection;
    }


    private static void printResults(ResultSet rs) throws SQLException {
        //STEP 5: Extract data from result set
        while (rs.next()) {
            //Retrieve by column name
            String stationId = rs.getString("stationid");

            //Display values
            System.out.println("Station Id: " + stationId);
        }
    }

}
