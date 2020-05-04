package com.ssoft.blogs.repository;

import com.ssoft.blogs.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
