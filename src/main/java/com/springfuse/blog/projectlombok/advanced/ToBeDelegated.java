package com.springfuse.blog.projectlombok.advanced;

import java.util.List;
import java.util.Map;

public class ToBeDelegated {
    public String simple() {
        return "method1";
    }

    public List<Map<String, List<String>>> complex() {
        throw new IllegalStateException();
    }
}
