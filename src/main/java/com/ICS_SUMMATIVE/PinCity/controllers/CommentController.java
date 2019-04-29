package com.ICS_SUMMATIVE.PinCity.controllers;

import java.util.Optional;

import com.ICS_SUMMATIVE.PinCity.models.Comment;
import com.ICS_SUMMATIVE.PinCity.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    /*
     * public Optional<Comment> show(@PathVariable String id) { Optional<Comment> c
     * = commentRepository.findById(id); Comment co = c.get();
     * 
     * }
     */

    @RequestMapping(method = RequestMethod.POST, value = "/comments/{id}")
    public Comment save(@RequestBody Comment comment) {
        commentRepository.save(comment);

        return comment;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/comments/addLike/{id}")
    public Comment update(@PathVariable String id, @RequestBody Comment comment) {
        Optional<Comment> optComment = commentRepository.findById(id);
        Comment c = optComment.get();

        c.setLike(comment.getLike() + 1);
        commentRepository.save(c);

        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/comments/{id}")
    public String delete(@PathVariable String id) {
        Optional<Comment> optComment = commentRepository.findById(id);
        Comment comment = optComment.get();
        commentRepository.delete(comment);

        return "";
    }
}