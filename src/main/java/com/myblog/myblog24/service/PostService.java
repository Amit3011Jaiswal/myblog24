package com.myblog.myblog24.service;

import com.myblog.myblog24.payload.PostDto;

import java.util.List;

public interface PostService  {

    PostDto createPost(PostDto postDto);


    PostDto getPostById(long id);


    List<PostDto> getAllPosts(int pageNo, int pageSize);
}
