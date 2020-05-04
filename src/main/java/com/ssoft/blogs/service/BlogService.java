package com.ssoft.blogs.service;

import com.ssoft.blogs.entity.Blog;
import com.ssoft.blogs.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public List<Blog> getBlogs(){
        return blogRepository.findAll();
    }

    public Blog getBlog(Long id){
        // TODO return 404
        return blogRepository.findById(id).orElseThrow( () -> new RuntimeException("Blog not found") );
    }

    public Long addBlog(Blog blog){
        return blogRepository.save(blog).getId();
    }

    public void deleteBlog(Long id){
        blogRepository.deleteById(id);
    }

    public Long editBlog(Blog blog){
        return blogRepository.save(blog).getId();
    }
}
