package com.spring.exam.SpringBootExam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exam.SpringBootExam.model.Book;
import com.spring.exam.SpringBootExam.model.PublishingHouse;
import com.spring.exam.SpringBootExam.repository.BookRepository;

@RestController
public class BookController {
	
		@Autowired
		BookRepository bookres;

		@GetMapping(value = "/book")
		public List<Book> getAll() {

			List<Book> emps = bookres.getAllBooksData();
			return emps;
		}


		@RequestMapping(value = "/addbook", method = RequestMethod.POST)
		public ResponseEntity<Object> addBookdetails(@RequestBody Book bookobj) {

			bookres.InsertBookdata(bookobj);
			return new ResponseEntity<>("Book is created successfully", HttpStatus.CREATED);
		}

		@RequestMapping(value = "/updateBook/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Object> Updatehospdetails( @PathVariable("id") int id,@RequestBody Book book) {

			bookres.Updatedata(book,id);
			return new ResponseEntity<>("Updation done successfully", HttpStatus.OK);
		}
		
		
		@GetMapping(value = "/publish")
		public List<PublishingHouse> getAllPubs() {

			List<PublishingHouse> list = bookres.getAllPubData();
			return list;
		}
		
		
		@RequestMapping(value = "/addpub", method = RequestMethod.POST)
		public ResponseEntity<Object> addpubdetails(@RequestBody PublishingHouse pobj) {

			bookres.InsertPubdata(pobj);
			return new ResponseEntity<>("publisher is created successfully", HttpStatus.CREATED);
		}

		@RequestMapping(value = "/updatepub/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Object> Updatepubdetails( @PathVariable("id") int id,@RequestBody PublishingHouse pobj) {

			bookres.UpdatePubdata(pobj,id);
			return new ResponseEntity<>("Updation done successfully", HttpStatus.OK);
		}
	}


