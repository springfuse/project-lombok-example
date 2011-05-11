package com.springfuse.blog.projectlombok;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UsingProjectLombokTest {

	@Test
	public void test() {
		UsingProjectLombok p1 = buildExample();
		UsingProjectLombok p2 = buildExample();
		assertNotNull(p1.toString());
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		System.out.println(p1);
	}

	private UsingProjectLombok buildExample() {
		UsingProjectLombok p = new UsingProjectLombok();
		p.setGet("a");
		p.setFun("b");
		p.setBack("c");
		return p;
	}
}
