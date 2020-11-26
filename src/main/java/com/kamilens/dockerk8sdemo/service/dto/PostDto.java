package com.kamilens.dockerk8sdemo.service.dto;

import lombok.Data;

@Data
public class PostDto {

    private Long id;
    private Long userId;
    private String title;
    private String body;

}
