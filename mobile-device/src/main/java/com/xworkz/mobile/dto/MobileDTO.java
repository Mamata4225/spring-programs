package com.xworkz.mobile.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "mobile")
@Component
public class MobileDTO implements Serializable {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String Name;

	public MobileDTO() {
		System.out.println("Object is created" + getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public MobileDTO(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "MobileDTO [id=" + id + ", Name=" + Name + "]";
	}
 	

}
