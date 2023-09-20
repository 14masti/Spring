package com.spring.exam.SpringBootExam.model;



public class Book {
    private int bookID;
    private String title;
    private String isbn;
   
    private String genre;
    private String language;
    private int pageCount;
    private double price;
    private int publisherID;
    
    
  
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", isbn=" + isbn + ", publicationDate=" 
				+ ", genre=" + genre + ", language=" + language + ", pageCount=" + pageCount + ", price=" + price
				+ ", publisherID=" + publisherID + "]";
	}
    
    
    
}