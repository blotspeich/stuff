package com.catalyst.spacedout.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MonthlyPass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passId;
	
	@Column(nullable = false)
	private BigDecimal passPrice;

	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public BigDecimal getPassPrice() {
		return passPrice;
	}

	public void setPassPrice(BigDecimal passPrice) {
		this.passPrice = passPrice;
	}
	

}
