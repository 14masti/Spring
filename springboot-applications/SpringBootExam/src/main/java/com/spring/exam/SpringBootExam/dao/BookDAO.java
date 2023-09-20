package com.spring.exam.SpringBootExam.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.spring.exam.SpringBootExam.contract.*;
import com.spring.exam.SpringBootExam.model.Book;
import com.spring.exam.SpringBootExam.model.PublishingHouse;

@Component
public class BookDAO implements IntBookDAO{
	
		JdbcTemplate jdbcTemplate;
		
		
		
		@Autowired
		public void BookcompDAO(DataSource dataSource) {
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
		
		
		private final String SQL_ALLBOOKS = "select * from masti_Book";
		private final String SQL_INSERT_ALLBOOKS= "INSERT INTO masti_Book (BookID, Title, ISBN, Genre, Language, PageCount, Price, PublisherID) VALUES (?, ?, ?, ?, ?,?,?,?)";
		private final String SQL_PUT_ALLBOOKS = "UPDATE masti_Book SET genre = ? WHERE bookid = ?";

		private final String SQL_ALLPUB = "select * from masti_PublishingHouse";
		private final String SQL_INSERT_PUBLISHINGHOUSE = "INSERT INTO masti_PublishingHouse (PublisherID, PublisherName, Location, ContactInfo) VALUES (?, ?, ?, ?)";
		private final String SQL_UPDATE_PUBLISHINGHOUSE = "UPDATE masti_PublishingHouse SET PublisherName = ?, Location = ?, ContactInfo = ? WHERE PublisherID = ?";

		@Override
		public List<Book> getAllBook() {
			
			return jdbcTemplate.query(SQL_ALLBOOKS, new BookMapper());
		}
		
		
		
		@Override
		public boolean InsertBook(Book b) {
			return jdbcTemplate.update(SQL_INSERT_ALLBOOKS,
		            b.getBookID(),
		            b.getTitle(),
		            b.getIsbn(),
		          
		            b.getGenre(),
		            b.getLanguage(),
		            b.getPageCount(),
		            b.getPrice(),
		            b.getPublisherID()) > 0;
		}
		
		
		@Override
		public int updateBook(Book b, int id) {
			return jdbcTemplate.update(SQL_PUT_ALLBOOKS,b.getGenre(),id);
		}
		
		
		
		@Override
		public List<PublishingHouse> getAllPub() {
			
			return jdbcTemplate.query(SQL_ALLPUB, new PublishingHouseMapper());
		}
		
		
		
	
		@Override
		public boolean InsertPub(PublishingHouse publishingHouse) {
			 return jdbcTemplate.update(SQL_INSERT_PUBLISHINGHOUSE,
			            publishingHouse.getPublisherID(),
			            publishingHouse.getPublisherName(),
			            publishingHouse.getLocation(),
			            publishingHouse.getContactInfo()) > 0;
		}



		@Override
		public int updatePub(PublishingHouse publishingHouse, int id) {
			 return jdbcTemplate.update(SQL_UPDATE_PUBLISHINGHOUSE,
			            publishingHouse.getPublisherName(),
			            publishingHouse.getLocation(),
			            publishingHouse.getContactInfo(),
			            publishingHouse.getPublisherID());
		}
		
		
	
		  

	}



