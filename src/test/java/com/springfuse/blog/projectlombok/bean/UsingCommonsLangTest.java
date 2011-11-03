package com.springfuse.blog.projectlombok.bean;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UsingCommonsLangTest {
    @Test
    public void executeToString() {
        final String toString = newGod().toString();
        assertThat(toString) //
                .startsWith(UsingCommonsLang.class.getName()) //
                .endsWith("[name=Norris,firstname=Chuck,age=71]");
        System.out.println(toString);
    }

    private UsingCommonsLang newGod() {
        UsingCommonsLang god = new UsingCommonsLang();
        god.setName("Norris");
        god.setFirstname("Chuck");
        god.setAge(71);
        return god;
    }
}
