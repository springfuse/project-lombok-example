package com.springfuse.blog.projectlombok.bean;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UsingProjectLombokTest {
    @Test
    public void test() {
        UsingProjectLombok chuck = newGod();
        UsingProjectLombok chucky = newGod();
        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .startsWith(UsingProjectLombok.class.getSimpleName()) //
                .endsWith("(name=Norris, firstname=Chuck, age=71)");
        System.out.println(chuck);
    }

    private UsingProjectLombok newGod() {
        UsingProjectLombok god = new UsingProjectLombok();
        god.setName("Norris");
        god.setFirstname("Chuck");
        god.setAge(71);
        return god;
    }
}
