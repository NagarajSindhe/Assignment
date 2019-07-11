package com.java2novice.restful;


public interface DBConstants {
	public String CLASS_DRIVER = "com.mysql.jdbc.Driver";
	public String JDBC_URL = "jdbc:mysql://localhost:3306/hr";
	public String USER_NAME = "root";
	public String USER_PASSWORD = "root";
	public String SELECT_STATEMENT= "Select * From website";
	public String DELETE_STATEMENT= "Delete From website ";
	static SingltonDBConnection dbConnection = SingltonDBConnection.getInstance();
	

}
