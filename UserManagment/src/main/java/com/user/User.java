package com.user;

public class User {
      protected int id;
      protected String name;
      protected String email;
      protected String contry;
      
     
	public User(String name, String email, String contry) {
		super();
		this.name = name;
		this.email = email;
		this.contry = contry;
	}
	public User(int id, String name, String email, String contry) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contry = contry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
         
}
