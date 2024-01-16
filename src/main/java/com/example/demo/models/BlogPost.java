package com.example.demo.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "blogpost")

public class BlogPost {
    @Id
    private String id;
    private String title;
    private String content;
    private String postedBy = "Tommy";
    @CreatedDate
    private Date created_at;
    public BlogPost() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public Date getCreated_at() {
        return created_at;
    }
}
