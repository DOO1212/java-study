package chap13.List;

public class Book {
	
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	

	
	
	
	
	
	

}
