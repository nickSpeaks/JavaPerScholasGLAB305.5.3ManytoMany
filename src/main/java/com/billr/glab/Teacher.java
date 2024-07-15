package com.billr.glab;


import java.util.Set;

import jakarta.persistence.*;
@Entity
@Table(name="Teacher")
public class Teacher{
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tit;
	private String salary;
	private String Teachername;
	
	 @ManyToMany(targetEntity = Cohort.class)
	 private Set CohortSet;
	public Teacher(String salary, String teachername, Set CohortSet) {
	this.salary = salary;
	this.Teachername = teachername;
	this.CohortSet = CohortSet;
		
	}
	public Teacher() {
		super();
	}
}
