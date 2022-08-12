package com.tns.entity;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {

	
	@Id
    private Integer id;
	private String name;
	private String type;
	private String password;
	
	public User()
	{	
		System.out.println("Done with User");
	}
	@Id 
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
}

