package com.springfuse.blog.projectlombok;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsingProjectLombokWithConfigurationTest {
	@Test
	public void test() {
		UsingProjectLombokWithConfiguration p1 = buildExample();
		UsingProjectLombokWithConfiguration p2 = buildExample();
		assertNotNull(p1.toString());
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		System.out.println(p1);
	}

	private UsingProjectLombokWithConfiguration buildExample() {
		return new UsingProjectLombokWithConfiguration("a", "b", "c");
	}
}
