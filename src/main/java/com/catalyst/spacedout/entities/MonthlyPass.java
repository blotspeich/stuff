package com.catalyst.spacedout.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class MonthlyPass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passId;
	
	@NotNull
	@OneToOne (cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinColumn
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(nullable = false)
	private Double passPrice;
	
	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public Double getPassPrice() {
		return passPrice;
	}

	public void setPassPrice(Double passPrice) {
		this.passPrice = passPrice;
	}
	

}
