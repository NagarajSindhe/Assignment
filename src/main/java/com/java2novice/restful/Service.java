package com.java2novice.restful;

import java.util.List;

public interface Service {
	List<Books> pushAllRecords(Books books);

	int updateBooks(Books books);

	int addBooks(Books books);

	List<Books> getAllBooks();

}
