package Test;

import java.sql.*;
import java.util.Calendar;
 
/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 * 
 * Created by Alvin Alexander, <a href="http://devdaily.com" title="http://devdaily.com">http://devdaily.com</a>
 */
public class JavaMysqlPreparedStatementInsertExample2
{
 
  public static void main(String[] args)
  {
    try
    {
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/test1";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "User1212");
     
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
 
      // the mysql insert statement
      String query = " insert into pet (name, owner)"
        + " values (?, ?)";
 
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, "Wen");
      preparedStmt.setString (2, "Yao");
 
      // execute the preparedstatement
      preparedStmt.execute();
       
      conn.close();
    }
    catch (Exception e)
    {
      //System.err.println("Got an exception!");
      //System.err.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
