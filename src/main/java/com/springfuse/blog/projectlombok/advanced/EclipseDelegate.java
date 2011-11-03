package com.springfuse.blog.projectlombok.advanced;

import java.util.List;
import java.util.Map;

public class EclipseDelegate {
    private ToBeDelegated toBeDelegated = new ToBeDelegated();

    public String simple() {
        return toBeDelegated.simple();
    }

    public List<Map<String, List<String>>> complex() {
        return toBeDelegated.complex();
    }
}
