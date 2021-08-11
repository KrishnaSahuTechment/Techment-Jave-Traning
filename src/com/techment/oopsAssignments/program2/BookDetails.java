package com.techment.oopsAssignments.program2;




class Book
{
	 private int bookNo;
	 private String title;
	 private String author;
	 private float price;
	
	 
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	 
	 
	 
}



class EngineeringBook extends Book
{
	 private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	 
	 	
}




public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setBookNo(1);
		book.setAuthor("krishna sahu");
		book.setPrice(1000);
		book.setTitle("java programming language");
		
		EngineeringBook engineeringBook = new EngineeringBook();
		engineeringBook.setCategory("computer science");
		
		System.out.println("Book name = "+engineeringBook.getTitle());   	// private data members are not accessible from outside of class and does not inherited
		System.out.println("Book number = "+engineeringBook.getBookNo()); 	// private data members are not accessible from outside of class and does not inherited
		System.out.println("Book Price = "+engineeringBook.getPrice()); 	// private data members are not accessible from outside of class and does not inherited
		System.out.println("Book Auther = "+engineeringBook.getAuthor()); 	// private data members are not accessible from outside of class and does not inherited
		System.out.println("Book catergory = "+engineeringBook.getCategory()); // accessible for same class
	}

}
