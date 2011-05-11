package com.springfuse.blog.projectlombok;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UsingCommonsLang {
	private String not;
	private String really;
	private String fun;

	public String getNot() {
		return not;
	}

	public void setNot(String not) {
		this.not = not;
	}

	public String getReally() {
		return really;
	}

	public void setReally(String really) {
		this.really = really;
	}

	public String getFun() {
		return fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
