package com.java2novice.restful;

public class GetRecords {

	public static void main(String[] args) {
		Books book=new Books();
		book.setBookId(1);
		//book.setBookName("Test Book");
		//System.out.println(new ServiceImpl().pushAllRecords(book));
		/*Books books=new Books();
		books.setBookId(1);
		books.setBookName("This is updates ");
		books.setBookAuthor("Author updated");
		System.out.println(new ServiceImpl().updateBooks(books));*/
		
		System.out.println(new ServiceImpl().getAllBooks());
		
		Books books=new Books();
		//books.setBookId(1);
		books.setBookName("This is updates ");
		books.setBookAuthor("Author updated");
		books.setBookDescription("This is description");
		
		System.out.println(new ServiceImpl().addBooks(books));
	}

}
