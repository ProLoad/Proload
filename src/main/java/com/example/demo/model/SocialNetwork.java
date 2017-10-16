package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="social_networks")
public class SocialNetwork {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String facebook;
	private String twitter;
	private String instagram;
	private String google;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getGoogle() {
		return google;
	}
	public void setGoogle(String google) {
		this.google = google;
	}
	@Override
	public String toString() {
		return "SocialNetwork [id=" + id + ", facebook=" + facebook + ", twitter=" + twitter + ", instagram="
				+ instagram + ", google=" + google + "]";
	}
	
	
	
	
}
