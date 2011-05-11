package com.springfuse.blog.projectlombok;

import org.junit.Test;

public class UsingCommonsLangTest {
    @Test
    public void executeToString() {
        UsingCommonsLang p = buildExample();
        System.out.println(p);
    }

    private UsingCommonsLang buildExample() {
        UsingCommonsLang p = new UsingCommonsLang();
        p.setNot("a");
        p.setReally("b");
        p.setFun("c");
        return p;
    }
}
