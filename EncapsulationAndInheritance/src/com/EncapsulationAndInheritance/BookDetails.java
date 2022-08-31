package com.EncapsulationAndInheritance;

class Book {
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
class EngineeringBook extends Book {
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
		// test 1 
		System.out.println("Testing book class");
		Book b1 = new Book();
		b1.setBookNo(1);
		b1.setTitle("two states");
		b1.setAuthor("chetan bhagat");
		b1.setPrice(500);
		
		System.out.println(b1.getBookNo());
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());

		System.out.println("Testing engineering book class");
		
		EngineeringBook e1 = new EngineeringBook();
		e1.setBookNo(2);
		e1.setTitle("bme");
		e1.setAuthor("shivani");
		e1.setPrice(200);
		e1.setCategory("engineering");
		
		System.out.println(e1.getBookNo());
		System.out.println(e1.getTitle());
		System.out.println(e1.getAuthor());
		System.out.println(e1.getPrice());
		System.out.println(e1.getCategory());
	}

}
