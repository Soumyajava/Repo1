package com.san.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="user_login")
public class User_login {
	@Id
	@GeneratedValue
	private Integer id;
	private String uname;
	private String uadd;
	private Integer uage;
	private String usex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUadd() {
		return uadd;
	}
	public void setUadd(String uadd) {
		this.uadd = uadd;
	}
	public Integer getUage() {
		return uage;
	}
	public void setUage(Integer uage) {
		this.uage = uage;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	
	@Override
	public String toString() {
		return "User_login [id=" + id + ", uname=" + uname + ", uadd=" + uadd + ", uage=" + uage + ", usex=" + usex
				+ "]";
	}
	public User_login() {
		System.out.println("entity object created");
	}
	

}
