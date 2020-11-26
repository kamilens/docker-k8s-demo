package com.kamilens.dockerk8sdemo.service.dto;

import lombok.Data;

@Data
public class CommentDto {

    private Long id;
    private Long postId;
    private String name;
    private String body;
    private String email;

}
