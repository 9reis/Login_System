package com.login_system.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	protected Connection connection;
	protected PreparedStatement statement; 
	protected ResultSet result; 
	
	private static final String DATABASE 	= "login_system?serverTimezone=UTC";
	private static final String USER 		= "root";
	private static final String PASS		= "";
	private static final String DRIVER 		= "com.mysql.cj.jdbc.Diver";
	private static final String URL 		= "jdbc:mysql://localhost:3306/"+DATABASE;
	
	public void openConnection() throws Exception {
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL, USER, PASS);
	}
	
	public void closeConnection() throws Exception{
		if(!connection.isClosed()) {
			connection.close();
		}
	}
	
}

