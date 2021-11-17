package com.springrestscheduler.scheduler.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	private long rollno;
	private String sClass;
	private String name;
	private String preference;
	public Students(long rollno, String sClass, String name,String preference) {
		super();
		this.rollno = rollno;
		this.sClass = sClass;
		this.name = name;
		this.preference=preference;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", sClass=" + sClass + ", name=" + name + ", preference=" + preference
				+ "]";
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	
}
