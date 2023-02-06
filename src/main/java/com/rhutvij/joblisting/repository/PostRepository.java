package com.rhutvij.joblisting.repository;

import com.rhutvij.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
