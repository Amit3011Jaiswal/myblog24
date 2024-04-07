package com.myblog.myblog24.repository;

import com.myblog.myblog24.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
