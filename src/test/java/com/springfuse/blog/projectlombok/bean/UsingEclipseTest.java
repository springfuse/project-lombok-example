package com.springfuse.blog.projectlombok.bean;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class UsingEclipseTest {
    @Test
    public void test() {
        UsingEclipse chuck = newGod();
        UsingEclipse chucky = newGod();
        assertThat(chuck).isEqualTo(chucky);
        assertThat(chuck.hashCode()).isEqualTo(chucky.hashCode());
        assertThat(chuck.toString()) //
                .startsWith(UsingEclipse.class.getSimpleName()) //
                .endsWith("[name=Norris, firstname=Chuck, age=71]");
        System.out.println(chuck);
    }

    private UsingEclipse newGod() {
        UsingEclipse god = new UsingEclipse();
        god.setName("Norris");
        god.setFirstname("Chuck");
        god.setAge(71);
        return god;
    }
}
