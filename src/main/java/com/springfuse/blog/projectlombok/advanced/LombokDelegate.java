package com.springfuse.blog.projectlombok.advanced;

import lombok.Delegate;

public class LombokDelegate {
    @Delegate
    private ToBeDelegated toBeDelegated = new ToBeDelegated();
}
