package com.springfuse.blog.projectlombok.advanced;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ValExampleTest {

    @Test
    public void buildWithoutArgs() {
        assertThat(new ValExample().converter()).isEmpty();
    }

    @Test
    public void buildWithOneArg() {
        assertThat(new ValExample().converter("chuck")) //
                .isNotEmpty() //
                .hasSize(1) //
                .contains("chuck");
    }

    @Test
    public void buildWithManyArgs() {
        assertThat(new ValExample().converter("chuck", "chucky", "nono")) //
                .isNotEmpty() //
                .hasSize(3) //
                .contains("chuck") //
                .containsExactly("chuck", "chucky", "nono");
    }
}
