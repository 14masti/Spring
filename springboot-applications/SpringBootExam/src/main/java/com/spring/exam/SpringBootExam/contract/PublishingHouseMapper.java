package com.spring.exam.SpringBootExam.contract;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.spring.exam.SpringBootExam.model.PublishingHouse;

public class PublishingHouseMapper implements RowMapper<PublishingHouse> {
	@Override
	public PublishingHouse mapRow(ResultSet rs, int rowNum) throws SQLException {
        PublishingHouse publishingHouse = new PublishingHouse();
        publishingHouse.setPublisherID(rs.getInt("PublisherID"));
        publishingHouse.setPublisherName(rs.getString("PublisherName"));
        publishingHouse.setLocation(rs.getString("Location"));
        publishingHouse.setContactInfo(rs.getString("ContactInfo"));
        
        return publishingHouse;
    }

}



