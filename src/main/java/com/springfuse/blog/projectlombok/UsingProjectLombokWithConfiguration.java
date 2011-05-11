package com.springfuse.blog.projectlombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(exclude = { "get" })
@ToString(exclude = { "get" })
public class UsingProjectLombokWithConfiguration {
	protected String get;
	@Getter
	private String fun;
	@Getter
	@Setter
	private String back;

	public UsingProjectLombokWithConfiguration(String get, String fun, String back) {
		this.get = get;
		this.fun = fun;
		this.back = back;
	}
}
