package com.spring.mongo.demo.controller;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.service.EmployeeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-query")
public class EmployeeQueryController {

    @Autowired
    private EmployeeQueryService employeeQueryService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeQueryService.getAll();
    }


    // getAll employee by first name (equals())
    @GetMapping("/firstName/{firstName}")
    public List<Employee> getEmployeeByFirstName(@PathVariable String firstName) {
        return employeeQueryService.getEmployeeByFirstName(firstName);
    }


    // getAll employee by first name (equals())
    @GetMapping("/one-by-firstName/{firstName}")
    public Employee getOneEmployeeByFirstName(@PathVariable String firstName) {
        return employeeQueryService.getOneEmployeeByFirstName(firstName);
    }

    // getAll employee by first name %LIKE%
    @GetMapping("/firstName-like/{firstName}")
    public List<Employee> getEmployeeByFirstNameLike(@PathVariable String firstName) {
        return employeeQueryService.getEmployeeByFirstNameLike(firstName);
    }


    // getAll employee by last name (equals())
    @GetMapping("/one-by-lastName/{lastName}")
    public Employee getSingleEmployeeByLastName(@PathVariable String lastName) {
        return employeeQueryService.getSingleEmployeeByLastName(lastName);
    }


    @GetMapping("/salary-greater-than/{salary}")
    public List<Employee> getEmployeeBySalaryGreaterThan(@PathVariable int salary) {
        return employeeQueryService.getEmployeeBySalaryGreaterThan(salary);
    }


    @PostMapping("/get-by-condition")
    public List<Employee> getEmployeeByCondition(@RequestBody Employee employee) {
        return employeeQueryService.getEmployeeByCondition(employee);
    }


    @GetMapping("/age-range")
    public List<Employee> getEmployeesByAgeRange(@RequestParam("minAge") int minAge, @RequestParam("maxAge") int maxAge) {
        return employeeQueryService.getEmployeesByAgeRange(minAge, maxAge);
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        return employeeQueryService.getEmployeesByDepartment(department);
    }

    @GetMapping("/job-title/{jobTitle}")
    public List<Employee> getEmployeesByJobTitle(@PathVariable String jobTitle) {
        return employeeQueryService.getEmployeesByJobTitle(jobTitle);
    }

    @GetMapping("/age-greater-than/{age}")
    public List<Employee> getEmployeesByAgeGreaterThanOrEqualTo(@PathVariable int age) {
        return employeeQueryService.getEmployeesByAgeGreaterThanOrEqualTo(age);
    }

    @GetMapping("/age-less-than/{age}")
    public List<Employee> getEmployeesByAgeLessThanOrEqualTo(@PathVariable int age) {
        return employeeQueryService.getEmployeesByAgeLessThanOrEqualTo(age);
    }

    @GetMapping("/salary-range")
    public List<Employee> getEmployeesBySalaryRange(@RequestParam("minSalary") int minSalary, @RequestParam("maxSalary") int maxSalary) {
        return employeeQueryService.getEmployeesBySalaryRange(minSalary, maxSalary);
    }


    @GetMapping("/experience-greater-than/{years}")
    public List<Employee> getEmployeesByExperienceGreaterThan(@PathVariable int years) {
        return employeeQueryService.getEmployeesByExperienceGreaterThan(years);
    }

    @GetMapping("/experience-less-than/{years}")
    public List<Employee> getEmployeesByExperienceLessThan(@PathVariable int years) {
        return employeeQueryService.getEmployeesByExperienceLessThan(years);
    }

    @GetMapping("/age-and-department")
    public List<Employee> getEmployeesByAgeAndDepartment(@RequestParam("age") int age, @RequestParam("department") String department) {
        return employeeQueryService.getEmployeesByAgeAndDepartment(age, department);
    }

    @GetMapping("/location/{location}")
    public List<Employee> getEmployeesByLocation(@PathVariable String location) {
        return employeeQueryService.getEmployeesByLocation(location);
    }

    @GetMapping("/gender/{gender}")
    public List<Employee> getEmployeesByGender(@PathVariable String gender) {
        return employeeQueryService.getEmployeesByGender(gender);
    }

    @GetMapping("/language-skill/{language}")
    public List<Employee> getEmployeesByLanguageSkill(@PathVariable String language) {
        return employeeQueryService.getEmployeesByLanguageSkill(language);
    }

    @GetMapping("/department-and-salary-range")
    public List<Employee> getEmployeesByDepartmentAndSalaryRange(@RequestParam("department") String department, @RequestParam("minSalary") int minSalary, @RequestParam("maxSalary") int maxSalary) {
        return employeeQueryService.getEmployeesByDepartmentAndSalaryRange(department, minSalary, maxSalary);
    }

}
