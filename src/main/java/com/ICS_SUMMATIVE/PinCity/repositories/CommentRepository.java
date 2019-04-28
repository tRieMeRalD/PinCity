package com.ICS_SUMMATIVE.PinCity.repositories;

import com.ICS_SUMMATIVE.PinCity.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, String> {
    @Override
    void delete(Comment deleted);
}