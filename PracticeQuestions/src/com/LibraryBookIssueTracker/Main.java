package com.LibraryBookIssueTracker;
import java.util.*;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		LibraryService service= new LibraryService();
		System.out.println("Enter no. of books  to issue:");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int studentId= sc.nextInt();
			int bookId= sc.nextInt();
			String bookName= sc.nextLine();
			
			
			Book book = new Book(bookId, bookName);
			
			boolean issued= service.issueBook(studentId, book);
			
			if(issued) {
				System.out.println("Book issued successfully!");
			}else {
				System.out.println("Issue Limit Reached");
			}
		}
			sc.close();
			Thread.sleep(2000);
			
			System.out.println("\n--- Final Issued Books Report ---");
			Map<Integer, List<Book>> result= service.getAllIssuedBooks();
			
			for(Map.Entry<Integer,List<Book>> entry: result.entrySet()) {
				System.out.print(entry.getKey() + " : ");
				
				List<Book> books= entry.getValue();
				for(int i1=0;i1<books.size();i1++) {
					System.out.print(books.get(i1));
					if(i1<books.size()) System.out.print(", ");
				}
					
				}
			System.out.println();
			}
		}



