package org.jsp.chetan.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
	@Column
String name;
int salary;
String department;

public Employee() {
	super();
}

public Employee(String name, int salary, String department) {
	super();
	this.name = name;
	this.salary = salary;
	this.department = department;
}

public Employee(int id, String name, int salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
	
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

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
}



}
