package com.uday;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id @GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "AGE")
	   private String age;
	@Column(name = "NAME")
	   private String name;
	   
	@Column(name = "MAIL")
	   private String mail;
	
	@Column(name = "PHNO")
	   private String phone;
	   

	  

	   public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	}