package com.springfuse.blog.projectlombok;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UsingEclipseTest {
	@Test
	public void test() {
		UsingEclipse p1 = buildExample();
		UsingEclipse p2 = buildExample();
		assertNotNull(p1.toString());
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		System.out.println(p1);
	}

	private UsingEclipse buildExample() {
		UsingEclipse p = new UsingEclipse();
		p.setNot("a");
		p.setReally("b");
		p.setFun("c");
		return p;
	}

}
