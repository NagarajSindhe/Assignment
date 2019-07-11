# Assignment
This is a library management system Java rest web service and MySQL database integrated with React JS
#clone the project
#import to eclipse
#Modify below content according to your DB details in DBConstants class.
Like usename, password, JDBC URL etc.
#package com.java2novice.restful;
public interface DBConstants {
	public String CLASS_DRIVER = "com.mysql.jdbc.Driver";
	public String JDBC_URL = "jdbc:mysql://localhost:3306/hr";
	public String USER_NAME = "root";
	public String USER_PASSWORD = "root";
	public String SELECT_STATEMENT= "Select * From website";
	public String DELETE_STATEMENT= "Delete From website ";
	static SingltonDBConnection dbConnection = SingltonDBConnection.getInstance();
}

#Create Table using below SQL query or Using MYSQL or SQL Developer depending on data base which you have. below is MYSQL script
CREATE TABLE `books` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) DEFAULT NULL,
  `bookDescription` varchar(255) DEFAULT NULL,
  `bookAuthor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
#Right click on project and Run as Maven Clean then Maven Install.
#Once code is compiled without errors, then right click on project-->properties-->click on -->Deployment Assembly-->
Clcick on-->Add--Select-->Java Build path Entries---> next --> add maven dependencies.
#Right click on project--> Export-->search web--->War file-->Click Next---> select the destination and finish.
#Deploy it on Tomcat server.

------------------------------------UI------------------------------------
#Import React JS Aapp and Open in VS code
#npm install
#npm start

