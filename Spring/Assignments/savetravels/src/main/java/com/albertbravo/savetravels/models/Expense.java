package com.albertbravo.savetravels.models;

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
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 5, max = 200, message="Must be atleast 5 characters")
	private String name;
	@NotNull
	@Size(min = 5, max = 200, message="Must be atleast 5 characters")
	private String description;
	@NotNull
	@Size(min = 3, max = 40, message="Must be atleast 3 characters")
	private String vendor;
	@NotNull(message="Cannot be 0")
	@Min(value=0)
	private Float amount;
	//This will not allow the createdAt column to be updated after creation
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Expense() {
	}
	
	public Expense(@NotNull @Size(min = 5, max = 200, message = "Must be atleast 5 characters") String name,
			@NotNull @Size(min = 5, max = 200, message = "Must be atleast 5 characters") String description,
			@NotNull @Size(min = 3, max = 40, message = "Must be atleast 3 characters") String vendor,
			@NotNull(message = "Cannot be 0") @NotBlank @Min(0) Float amount) {
		super();
		this.name = name;
		this.description = description;
		this.vendor = vendor;
		this.amount = amount;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}

