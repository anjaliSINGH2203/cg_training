package com.LibraryBookIssueTracker;

public class Book {
	private int bookId;
	private String bookName;
	//parameterized constructor
	Book(int bookId, String bookName){
		this.bookId= bookId;
		this.bookName= bookName;
	}
	//getters
	public int getBookId() {
		return bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String toString() {
		return bookId+ "- "+ bookName;
	}

}
