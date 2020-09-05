package com.org.versioning;

public class SpringV2 {

	private String name;
	
	private String version;

	public SpringV2() {
		
	}	
	
	public SpringV2(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}	
	
}
