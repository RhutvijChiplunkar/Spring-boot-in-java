package com.rhutvij.joblisting.repository;

import com.rhutvij.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
