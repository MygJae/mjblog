package com.mjblog.api.request;

import lombok.Data;

@Data
public class PostCreate {

    private String title;
    private String content;

}