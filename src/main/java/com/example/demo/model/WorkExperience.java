package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="work_experiences")
public class WorkExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull
	@NotEmpty
	private String job;

	@NotNull
	@NotEmpty
	private String exprience;
	@NotNull
	@NotEmpty
	private Date startDate;
	@NotNull
	@NotEmpty
	private Date endDate;
	@NotNull
	@NotEmpty
	private String company;
	@NotNull
	@NotEmpty
	@Email
	private String companyEmail;
	@NotNull
	@NotEmpty
	private String companyDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getExprience() {
		return exprience;
	}
	public void setExprience(String exprience) {
		this.exprience = exprience;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	@Override
	public String toString() {
		return "WorkExperience [id=" + id + ", job=" + job + ", exprience=" + exprience + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", company=" + company + ", companyEmail=" + companyEmail
				+ ", companyDescription=" + companyDescription + "]";
	}
	
	
}
