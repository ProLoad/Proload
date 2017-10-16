package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="faculties")
public class Faculty {

	private int id;
	@NotNull
	@NotEmpty
	private String faculty;
	private int deleted;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", faculty=" + faculty + ", deleted=" + deleted + "]";
	}
	
}
