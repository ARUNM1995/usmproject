package com.jspider.usm.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="usm")
public class RegisterDto implements Serializable {

	@Id
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator="any")
	private int id;
	private String name;
	private String email;
	private String city;
	private long phone;
	private int age;
	private String country;
	private String password;
	
	
	public RegisterDto() {
			System.out.println(this.getClass().getSimpleName()+"created");
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", phone=" + phone
				+ ", age=" + age + ", country=" + country + ", password=" + password + "]";
	}
}
