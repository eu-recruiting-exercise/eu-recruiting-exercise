package com.epiuse.recruiting;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import javassist.SerialVersionUID;

@Entity
@Table(name = "student")
public class Student implements Serializable {
	private static final long SerialVersionUID = 1L;

	@Id
	@Column(nullable = false, name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date birthdate;
	@Column(length = 128, name = "degree")
	private String degree;
	@Temporal(TemporalType.DATE)
	@Column(name = "entryDate")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date entrydate;
	@Column(length = 128, name = "firstName")
	private String firstname;
	@Column(length = 128, name = "lastName")
	private String lastname;
	@Column(length = 128, name = "year")
	private int year;
	@OneToMany(mappedBy = "studentInfo", orphanRemoval = true, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Module> modules;

	// ... getters

	public int getID() {
		return id;
	}

	public Date getbirthdate() {
		return birthdate;
	}

	public String getdegree() {
		return degree;
	}

	public Date getentrydate() {
		return entrydate;
	}

	public String getfirstname() {
		return firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public int getyear() {
		return year;
	}

	// setters
	public void setID(int newID) {
		this.id = newID;
	}

	public void setbirthdate(Date newbirthdate) {
		this.birthdate = newbirthdate;
	}

	public void setdegree(String newdegree) {
		this.degree = newdegree;
	}

	public void setfirstname(String newfirstname) {
		this.firstname = newfirstname;
	}

	public void setlastname(String newlastname) {
		this.lastname = newlastname;
	}

	public void setyear(int newyear) {
		this.year = newyear;
	}

}