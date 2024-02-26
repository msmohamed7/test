package com.spring.mongo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {

	@Id
	private String id;

	private int empId;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String location;
	private String languageSkills;
	private String department;
	private String jobTitle;
	private int experience;
	private float salary;

    public Employee(String id, int empId, String firstName, String lastName, float salary)
	{
		this.id = id;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
    }
}
