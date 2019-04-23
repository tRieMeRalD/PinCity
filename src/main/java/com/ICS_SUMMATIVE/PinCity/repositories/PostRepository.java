package com.ICS_SUMMATIVE.PinCity.repositories;

import com.ICS_SUMMATIVE.PinCity.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, String> {
    @Override
    void delete(Post deleted);
}