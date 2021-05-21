package org.btm;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
public Student(int id, String name, String lastname) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
}
public Student(String name, String lastname) {
	this.name = name;
	this.lastname = lastname;
}
public Student() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
private String name;
private String lastname;

@Override
public String toString() {
	return "Flight [Id=" + id + ", refNo=" + name + ", flightDate=" + lastname + "]";
} 
}
