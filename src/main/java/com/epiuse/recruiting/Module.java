package com.epiuse.recruiting;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javassist.SerialVersionUID;

@Entity
@Table(name = "module")
public class Module implements Serializable {
	private static final long SerialVersionUID = 1L;
	@Id
	@Column(nullable = false, name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;

	@Column(name = "modulecode")
	private boolean isdistinction;
	@Column(name = "marksRecieved")
	private float markRecieved;
	@Column(length = 128, name = "modulecode")
	private String modulecode;
	@Column(length = 128, name = "moduledescription")
	private String moduledescription;
	@Column(name = "snumber")
	private int snumber;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "snumber-fk")
	private Student stud;

	// ... getters

	public int getID() {
		return id;
	}

	public boolean getIsdistinction() {
		return isdistinction;
	}

	public double getmarkRecieved() {
		return markRecieved;
	}

	public String getmodulecode() {
		return modulecode;
	}

	public String getmoduledescription() {
		return moduledescription;
	}

	public int getsnumber() {
		return snumber;
	}

	// ...setters
	public void stID(int newID) {
		this.id = newID;
	}

	public void setIsdistinction(boolean newisdistinction) {
		this.isdistinction = newisdistinction;
	}

	public void setmarkRecieved(float newmarkRecieved) {
		this.markRecieved = newmarkRecieved;
	}

	public void setmodulecode(String newmodulecode) {
		this.modulecode = newmodulecode;
	}

	public void setmoduledescription(String newmoduledescription) {
		this.moduledescription = newmoduledescription;
	}

	public void setsnumber(int newsnumber) {
		this.snumber = newsnumber;
	}

}