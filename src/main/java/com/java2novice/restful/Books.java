package com.java2novice.restful;

import java.io.Serializable;

public class Books implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7911826740514620422L;
	private String bookName;
	private String bookDescription;
	private String bookAuthor;
	private int bookId;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", bookDescription=" + bookDescription + ", bookAuthor=" + bookAuthor
				+ ", bookId=" + bookId + "]";
	}
	
	
}
