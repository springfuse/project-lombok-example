package com.springfuse.blog.projectlombok.advanced;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EclipseDelegateTest {
    EclipseDelegate delegate;

    @Before
    public void setup() {
        delegate = new EclipseDelegate();
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
