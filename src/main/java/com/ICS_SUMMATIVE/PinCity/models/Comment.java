package com.ICS_SUMMATIVE.PinCity.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {
    @Id
    String id;
    /* String name; */
    String comment;

    public Comment() {
    }

    public Comment(String id, String comment) {
        /* this.name = name; */
        this.comment = comment;
    }

    /* GETT AND SETTER */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*
     * public String getName() { return name; }
     * 
     * public void setName(String name) { this.name = name; }
     */

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
