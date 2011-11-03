package com.springfuse.blog.projectlombok.advanced;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LombokDelegateTest {

    LombokDelegate delegate;

    @Before
    public void setup() {
        delegate = new LombokDelegate();
    }

    @Test
    public void test() {
        assertThat(delegate.simple()).isEqualTo("method1");
    }

    @Test(expected = IllegalStateException.class)
    public void complexThrowsException() {
        delegate.complex();
    }
}
