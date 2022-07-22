package com.vuklorr.blog.repo;

import com.vuklorr.blog.modelDB.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
}
