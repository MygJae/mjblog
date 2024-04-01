package com.mjblog.api.controller;

import com.mjblog.api.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PostController {

    @GetMapping("/get")
    public String get() {

        return "ok";
    }

    @PostMapping("/post")
    public String post(@RequestBody PostCreate params) {
        System.out.println("params = " + params.toString());
        return "ok";
    }


}

