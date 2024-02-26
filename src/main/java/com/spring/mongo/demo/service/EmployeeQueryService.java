package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Employee;

import java.util.List;

public interface EmployeeQueryService {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getSingleEmployeeByLastName(String lastName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getOneEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

	List<Employee> getEmployeeByCondition(Employee employee);


	List<Employee> getEmployeesByAgeRange(int minAge, int maxAg);

	List<Employee> getEmployeesByDepartment(String department);

	List<Employee> getEmployeesByJobTitle(String jobTitle);

	List<Employee> getEmployeesByAgeGreaterThanOrEqualTo(int age);

	List<Employee> getEmployeesByAgeLessThanOrEqualTo(int age);

	List<Employee> getEmployeesBySalaryRange(int minSalary, int maxSalary);

	List<Employee> getEmployeesByExperienceGreaterThan(int years);

	List<Employee> getEmployeesByExperienceLessThan(int years);

	List<Employee> getEmployeesByAgeAndDepartment(int age, String department);

	List<Employee> getEmployeesByLocation(String location);

	List<Employee> getEmployeesByGender(String gender);

	List<Employee> getEmployeesByLanguageSkill(String language);

	List<Employee> getEmployeesByDepartmentAndSalaryRange(String department, int minSalary, int maxSalary);
}
