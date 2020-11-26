package com.kamilens.dockerk8sdemo.service.impl;

import com.kamilens.dockerk8sdemo.domain.Constants;
import com.kamilens.dockerk8sdemo.service.PostService;
import com.kamilens.dockerk8sdemo.service.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private static final String POST_API = Constants.REST_API + "/posts";

    @Override
    public Set<PostDto> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        PostDto[] result = restTemplate.getForObject(POST_API, PostDto[].class);
        return Set.of(result);
    }

}
