package com.spring.exam.SpringBootExam.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.exam.SpringBootExam.dao.IntBookDAO;
import com.spring.exam.SpringBootExam.model.Book;
import com.spring.exam.SpringBootExam.model.PublishingHouse;
@Repository
public class BookRepository{

	@Autowired
	private IntBookDAO bookdao;
	
	public List<Book> getAllBooksData(){
		List<Book> l1= bookdao.getAllBook();
		return l1;
	}
	
	public boolean InsertBookdata(Book b) {
		return bookdao.InsertBook(b);
	}
	

	public int Updatedata(Book b,int id) {
		return bookdao.updateBook(b,id);
	}
	
	public List<PublishingHouse> getAllPubData(){
		List<PublishingHouse> l2= bookdao.getAllPub();
		return l2;
	}
	
	public boolean InsertPubdata(PublishingHouse p) {
		return bookdao.InsertPub(p);
	}
	

	public int UpdatePubdata(PublishingHouse p,int id) {
		return bookdao.updatePub(p,id);
	}
	


}