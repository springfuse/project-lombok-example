package com.springfuse.blog.projectlombok.bean;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UsingProjectLombokWithConfigurationTest {
    @Test
    public void test() {
        UsingProjectLombokWithConfiguration chuck = newGod();
        UsingProjectLombokWithConfiguration chucky = newGod();

        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .startsWith(UsingProjectLombokWithConfiguration.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck)");
        System.out.println(chuck);
    }

    private UsingProjectLombokWithConfiguration newGod() {
        return new UsingProjectLombokWithConfiguration("Norris", "Chuck", 71);
    }
}
