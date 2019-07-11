package com.java2novice.restful;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingltonDBConnection {

	private static SingltonDBConnection singltonDBConnection = null;
	private static Connection connection = null;
	// private Logger logger = LogFactory.getLogger(SingltonDBConnection.class);

	private SingltonDBConnection() {

	}

	public static synchronized SingltonDBConnection getInstance() {
		if (singltonDBConnection == null) {
			synchronized (SingltonDBConnection.class) {
				if (singltonDBConnection == null) {
					singltonDBConnection = new SingltonDBConnection();
					singltonDBConnection.getConnection();

				}
			}
		}
		return singltonDBConnection;

	}

	public synchronized Connection getConnection() {

		try {

			Class.forName(DBConstants.CLASS_DRIVER);
			connection = DriverManager.getConnection(DBConstants.JDBC_URL, DBConstants.USER_NAME,
					DBConstants.USER_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error Occured while getting connection : " + e);
			e.printStackTrace();
		} finally {

			try {
				if(connection==null) {
				connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

		return connection;

	}

}
