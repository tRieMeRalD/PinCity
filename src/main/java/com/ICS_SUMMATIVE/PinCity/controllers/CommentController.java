package com.ICS_SUMMATIVE.PinCity.controllers;

import com.ICS_SUMMATIVE.PinCity.models.Comment;
import com.ICS_SUMMATIVE.PinCity.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    CommentRepository commentRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/comments/{id}")
    public Iterable<Comment> comment() {
        return commentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/comments/{id}")
    public Comment save(@RequestBody Comment comment) {
        commentRepository.save(comment);

        return comment;
    }

}