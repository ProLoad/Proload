package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="activities")
public class Activity {
	
	private int id;
	@NotNull
	@NotEmpty
	private String title;
	@NotNull
	@NotEmpty
	private String file;
	private String photo;
	private String body;
	@NotNull
	@NotEmpty
	private String type;
	private Date uploadDate;
    private int status;
    private int delete;
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", title=" + title + ", file=" + file + ", photo=" + photo + ", body=" + body
				+ ", type=" + type + ", uploadDate=" + uploadDate + ", status=" + status + ", delete=" + delete + "]";
	}
    
	
}
