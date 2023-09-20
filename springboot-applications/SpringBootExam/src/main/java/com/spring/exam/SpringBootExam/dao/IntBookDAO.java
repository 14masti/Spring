package com.spring.exam.SpringBootExam.dao;

import java.util.List;

import com.spring.exam.SpringBootExam.model.Book;
import com.spring.exam.SpringBootExam.model.PublishingHouse;

public interface IntBookDAO {
	
	
	public List<Book> getAllBook();

	public boolean InsertBook(Book b);

	int updateBook(Book n,int id);
	
	public List<PublishingHouse> getAllPub();

	public boolean InsertPub(PublishingHouse p);

	int updatePub(PublishingHouse p,int id);

}
