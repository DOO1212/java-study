package chap13.homework01;

import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		BookController book = new BookController();
		
		List<Book> bo = book.bookList;
		
		for (int i = 0; i < bo.size(); i++) {
			System.out.println(bo.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
