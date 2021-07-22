package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.*;




@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Training {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	@Size(min=0,max=40,message="less than 40 character")
	private String centerName;
	
	@NotEmpty
	@Size(min=12,message="Exactly 12 Character")
	private String centerCode;
	

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Address> a;
	
	private int studentCapacity;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Course> course;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn= new Date(System.currentTimeMillis());

	@Email
	private String email;
	
	@NotBlank(message = "Mobile Number is required")
	@Size(min = 10, max = 10)
	private String mobileNo;
	
	

	
	
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	

	
	

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	public List<Address> getA() {
		return a;
	}

	public void setA(List<Address> a) {
		this.a = a;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	

	@Override
	public String toString() {
		return "Training [id=" + id + ", centerName=" + centerName + ", centerCode=" + centerCode + ", a=" + a
				+ ", studentCapacity=" + studentCapacity + ", course=" + course + ", createdOn=" + createdOn
				+ ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}

	
	
	
	

}
