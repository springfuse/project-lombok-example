package com.springfuse.blog.projectlombok.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(exclude = { "age" })
@ToString(exclude = { "age" })
public class UsingProjectLombokWithConfiguration {
    protected String name;
    @Getter
    private String firstname;
    @Getter
    @Setter
    private int age;

    public UsingProjectLombokWithConfiguration(String name, String firstname, int age) {
        super();
        this.name = name;
        this.firstname = firstname;
        this.age = age;
    }

}
