package com.xworkz.chocolate;

public class Database {
	private String url;
	private String username;
	private String password;
	private String name;

	public Database(String url, String username, String password, String name) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + ", name=" + name + "]";
	}

}
