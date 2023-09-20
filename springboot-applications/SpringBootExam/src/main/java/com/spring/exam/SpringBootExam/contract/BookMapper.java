package com.spring.exam.SpringBootExam.contract;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.exam.SpringBootExam.model.Book;


public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Book book = new Book();
        book.setBookID(resultSet.getInt("BookID"));
        book.setTitle(resultSet.getString("Title"));
        book.setIsbn(resultSet.getString("ISBN"));
       
        book.setGenre(resultSet.getString("Genre"));
        book.setLanguage(resultSet.getString("Language"));
        book.setPageCount(resultSet.getInt("PageCount"));
        book.setPrice(resultSet.getDouble("Price"));
        book.setPublisherID(resultSet.getInt("PublisherID"));
        
        return book;
    }
}





