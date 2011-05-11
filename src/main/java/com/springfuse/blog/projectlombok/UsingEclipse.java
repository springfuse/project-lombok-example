package com.springfuse.blog.projectlombok;

public class UsingEclipse {
	private String not;
	private String really;
	private String fun;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fun == null) ? 0 : fun.hashCode());
		result = prime * result + ((not == null) ? 0 : not.hashCode());
		result = prime * result + ((really == null) ? 0 : really.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsingEclipse other = (UsingEclipse) obj;
		if (fun == null) {
			if (other.fun != null)
				return false;
		} else if (!fun.equals(other.fun))
			return false;
		if (not == null) {
			if (other.not != null)
				return false;
		} else if (!not.equals(other.not))
			return false;
		if (really == null) {
			if (other.really != null)
				return false;
		} else if (!really.equals(other.really))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsingEclipse [fun=" + fun + ", not=" + not + ", really=" + really + "]";
	}

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

}