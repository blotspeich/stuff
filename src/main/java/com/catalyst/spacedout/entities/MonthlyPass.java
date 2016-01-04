package com.catalyst.spacedout.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MonthlyPass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int it;
	

}
