package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Employee;

import java.util.List;


public interface EmployeeQueryDao {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getSingleEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getSingleEmployeeByLastName(String lastName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

	List<Employee> getEmployeesByAgeRange(int minAge, int maxAge);

	List<Employee> getEmployeesByExperienceLessThan(int years);

	List<Employee> getEmployeesByDepartment(String department);

	List<Employee> getEmployeesByJobTitle(String jobTitle);

	List<Employee> getEmployeesByAgeGreaterThanOrEqualTo(int age);

	List<Employee> getEmployeesByAgeLessThanOrEqualTo(int age);

	List<Employee> getEmployeesBySalaryRange(int minSalary, int maxSalary);

	List<Employee> getEmployeesByExperienceGreaterThan(int years);

	List<Employee> getEmployeesByAgeAndDepartment(int age, String department);

	List<Employee> getEmployeesByLocation(String location);

	List<Employee> getEmployeesByGender(String gender);

	List<Employee> getEmployeesByLanguageSkill(String language);

	List<Employee> getEmployeesByDepartmentAndSalaryRange(String department, int minSalary, int maxSalary);

}
