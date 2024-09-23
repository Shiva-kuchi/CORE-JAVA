package com.evergent.corejava.FinalApplication;
import java.sql.Connection;
import java.sql.DriverManager;

public class MovieConnection 
{
	 public static Connection getConnection() throws Exception 
     {
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_project","root","admin");
         return conn;
     }
}
