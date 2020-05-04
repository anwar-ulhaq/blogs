package com.ssoft.blogs.controller;

import com.ssoft.blogs.entity.Blog;
import com.ssoft.blogs.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/blogs")
@CrossOrigin
public class BlogController {

    private final BlogService blogService;

    @GetMapping
    public List<Blog> getBlogs(){
        return blogService.getBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Long id ) {
        return blogService.getBlog(id);
    }

    @PostMapping
    public Long addBlog(@RequestBody Blog blog){
        return blogService.addBlog(blog);
    }
    //TODO Whole blog should be matched before deletion
    //
    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id){
        blogService.deleteBlog(id);
    }

    @PutMapping
    public Long editBlog(@RequestBody Blog blog){
        return blogService.editBlog(blog);
    }

}