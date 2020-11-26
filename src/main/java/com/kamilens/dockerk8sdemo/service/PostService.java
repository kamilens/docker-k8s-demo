package com.kamilens.dockerk8sdemo.service;

import com.kamilens.dockerk8sdemo.service.dto.PostDto;

import java.util.Set;

public interface PostService {

    Set<PostDto> getAll();

}
