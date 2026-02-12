package com.LibraryBookIssueTracker;
import java.util.*;

public class LibraryService {
	TreeMap<Integer,List<Book>> issuedBooksMap= new TreeMap<>();
	public boolean issueBook(int studentId, Book book) {
		if(issuedBooksMap.containsKey(studentId)) {
			List<Book> books=issuedBooksMap.get(studentId);
			if(books.size()>=3) return false;
			books.add(book);
			return true;
		}
		List<Book> books= new ArrayList<>();
		books.add(book);
		issuedBooksMap.put(studentId, books);
		return true;
		}
	
	public Map<Integer, List<Book>> getAllIssuedBooks(){
		return issuedBooksMap;
	}

}
