package com.rhutvij.joblisting.repository;

import com.rhutvij.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SearchRepositoryImpl implements SearchRepository{
    @Override
    public List<Post> findByText(String text){
        final List<Post> posts= new ArrayList<>();



        return posts;
    }
}

