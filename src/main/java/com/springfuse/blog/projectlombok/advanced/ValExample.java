package com.springfuse.blog.projectlombok.advanced;

import java.util.ArrayList;
import java.util.List;

import lombok.val;

public class ValExample {
    public List<String> converter(String... args) {
        val example = new ArrayList<String>();
        for (String arg : args) {
            example.add(arg);
        }
        return example;
    }
}
