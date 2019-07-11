package com.java2novice.restful;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class ServiceImpl implements Service {

	static List<Books> list = null;

	@Override
	public List<Books> getAllBooks() {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		list = new ArrayList<>();
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			String sql = "Select * From Books";
			statement = DBConstants.dbConnection.getConnection().prepareStatement(sql);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Books books = new Books();
				books.setBookId(resultSet.getInt(1));
				books.setBookName(resultSet.getString(2));
				books.setBookDescription(resultSet.getString(3));
				books.setBookAuthor(resultSet.getString(4));
				list.add(books);
			}

		} catch (SQLException e) {
			serviceResponse.setMessageId(e.toString());
			serviceResponse.setMessageName(e.getMessage());
			serviceResponse.setErrorCode(Response.status(Status.BAD_REQUEST).toString());
		}
		return list;
	}

	@Override
	public List<Books> pushAllRecords(Books books) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		list = new ArrayList<>();
		ServiceResponse serviceResponse = new ServiceResponse();
		try {
			statement = DBConstants.dbConnection.getConnection().prepareStatement("SELECT * FROM BOOKS where bookId='"
					+ books.getBookId() + "' OR bookName='" + books.getBookName() + "'");
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				books.setBookId(Integer.parseInt(resultSet.getString(1)));
				books.setBookName(resultSet.getString(2));
				books.setBookDescription(resultSet.getString(3));
				books.setBookAuthor(resultSet.getString(4));
				list.add(books);
			}
		} catch (SQLException e) {
			serviceResponse.setMessageId(e.toString());
			serviceResponse.setMessageName(e.getMessage());
			serviceResponse.setErrorCode(Response.status(Status.BAD_REQUEST).toString());
		}
		return list;
	}

	@Override
	public int addBooks(Books books) {
		PreparedStatement statement = null;
		int i = 0;
		String sql = "insert into Books (bookName,bookDescription,bookAuthor) values (?,?,?)";
		try {
			statement = DBConstants.dbConnection.getConnection().prepareStatement(sql);
			statement.setString(1, books.getBookName());
			statement.setString(2, books.getBookDescription());
			statement.setString(3, books.getBookAuthor());
			i = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateBooks(Books books) {
		PreparedStatement statement = null;
		int i = 0;
		String sql = "UPDATE BOOKS SET bookName=?, bookDescription=?, bookAuthor=? WHERE bookId='" + books.getBookId()
				+ "'";
		try {
			statement = DBConstants.dbConnection.getConnection().prepareStatement(sql);
			statement.setString(1, books.getBookName());
			statement.setString(2, books.getBookDescription());
			statement.setString(3, books.getBookAuthor());
			// statement.setInt(website.getId(), 4);
			i = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
