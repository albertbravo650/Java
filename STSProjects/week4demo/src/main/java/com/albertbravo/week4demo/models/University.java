package com.albertbravo.week4demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="universities")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="City cannot be empty.")
	@Size(min=2, max=255, message="Must be 2-255 characters.")
	private String city;
	
	@NotBlank(message="University name cannot be empty.")
	@Size(min=2, max=255, message="Must be 2-255 characters.")
	private String name;
	
	@NotNull(message="Cannot leave enrollment empty.")
	@Min(value=1, message="Must have atleast 1 student.")
	private Integer enrollment;
	
	@NotNull(message="Must select whether the university offers online courses.")
	private Boolean isOnline;
	
	@NotNull(message="Must select whether the university offers in-person courses.")
	private Boolean isInPerson;
	
	@NotNull(message="Year cannot be empty.")
	@Min(value=1, message="Year must be atleast 1.")
	private Integer yearFounded;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
        this.updatedAt = new Date(); // NEW: Added by me
    }
	
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public University() {
    	//empty constructor
    }

	public University(
			@NotBlank(message = "City cannot be empty.") @Size(min = 2, max = 255, message = "Must be 2-255 characters.") String city,
			@NotBlank(message = "University name cannot be empty.") @Size(min = 2, max = 255, message = "Must be 2-255 characters.") String name,
			@NotNull(message = "Cannot leave enrollment empty.") @Min(value = 1, message = "Must have atleast 1 student.") Integer enrollment,
			@NotNull(message = "Must select whether the university offers online courses.") Boolean isOnline,
			@NotNull(message = "Must select whether the university offers in-person courses.") Boolean isInPerson,
			@NotNull(message = "Year cannot be empty.") @Min(value = 1, message = "Year must be atleast 1.") Integer yearFounded) {
		this.city = city;
		this.name = name;
		this.enrollment = enrollment;
		this.isOnline = isOnline;
		this.isInPerson = isInPerson;
		this.yearFounded = yearFounded;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}

	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public Boolean getIsInPerson() {
		return isInPerson;
	}

	public void setIsInPerson(Boolean isInPerson) {
		this.isInPerson = isInPerson;
	}

	public Integer getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(Integer yearFounded) {
		this.yearFounded = yearFounded;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    

}
