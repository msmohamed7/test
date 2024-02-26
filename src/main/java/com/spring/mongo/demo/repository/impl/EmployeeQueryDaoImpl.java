package com.spring.mongo.demo.repository.impl;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.repository.EmployeeQueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeQueryDaoImpl implements EmployeeQueryDao {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Employee> getAll() {
        System.out.println("Inside Employee Query DAO Impl's get()");
        return mongoTemplate.findAll(Employee.class);
    }


    @Override
    public List<Employee> getEmployeeByFirstName(String firstName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(firstName));
        return new ArrayList<>(mongoTemplate.find(query, Employee.class));
    }


    @Override
    public Employee getSingleEmployeeByFirstName(String name) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(name));

        return mongoTemplate.findOne(query, Employee.class);
    }


    // "firstName"  --> database property (not related to java code)
    // select * from employee where lastName like %Gurung% limit 1 --> (case insensitive)
    @Override
    public List<Employee> getEmployeeByFirstNameLike(String firstName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").regex(firstName, "i"));

        return mongoTemplate.find(query, Employee.class);
    }


    @Override
    public Employee getSingleEmployeeByLastName(String lastName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("lastName").regex(lastName, "i"));

        return mongoTemplate.findOne(query, Employee.class);
    }




    @Override
    public List<Employee> getEmployeeBySalaryGreaterThan(int salary) {

        Query query = new Query();
        query.addCriteria(Criteria.where("salary").gt(salary));
        query.with(Sort.by(Sort.Direction.ASC, "firstName"));
        query.with(Sort.by(Sort.Direction.ASC, "firstName"));

        return mongoTemplate.find(query, Employee.class);
    }


    @Override
    public List<Employee> getEmployeesByAgeRange(int minAge, int maxAge) {
        Query query = new Query();
        query.addCriteria(Criteria.where("age").gte(minAge).lte(maxAge));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        Query query = new Query();
        query.addCriteria(Criteria.where("department").is(department));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByJobTitle(String jobTitle) {
        Query query = new Query();
        query.addCriteria(Criteria.where("jobTitle").is(jobTitle));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByAgeGreaterThanOrEqualTo(int age) {
        Query query = new Query();
        query.addCriteria(Criteria.where("age").gte(age));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByAgeLessThanOrEqualTo(int age) {
        Query query = new Query();
        query.addCriteria(Criteria.where("age").lte(age));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesBySalaryRange(int minSalary, int maxSalary) {
        Query query = new Query();
        query.addCriteria(Criteria.where("salary").gte(minSalary).lte(maxSalary));

        return mongoTemplate.find(query, Employee.class);
    }


    @Override
    public List<Employee> getEmployeesByExperienceGreaterThan(int years) {
        Query query = new Query();
        query.addCriteria(Criteria.where("experience").gt(years));

        return mongoTemplate.find(query, Employee.class);
    }


    @Override
    public List<Employee> getEmployeesByExperienceLessThan(int years) {
        Query query = new Query();
        query.addCriteria(Criteria.where("experience").lt(years));

        return mongoTemplate.find(query, Employee.class);
    }


    @Override
    public List<Employee> getEmployeesByAgeAndDepartment(int age, String department) {
        Query query = new Query();
        query.addCriteria(Criteria.where("age").is(age).and("department").is(department));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByLocation(String location) {
        Query query = new Query();
        query.addCriteria(Criteria.where("location").is(location));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        Query query = new Query();
        query.addCriteria(Criteria.where("gender").is(gender));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByLanguageSkill(String language) {
        Query query = new Query();
        query.addCriteria(Criteria.where("languageSkills").in(language));

        return mongoTemplate.find(query, Employee.class);
    }

    @Override
    public List<Employee> getEmployeesByDepartmentAndSalaryRange(String department, int minSalary, int maxSalary) {
        Query query = new Query();
        query.addCriteria(Criteria.where("department").is(department)
                .and("salary").gte(minSalary).lte(maxSalary));

        return mongoTemplate.find(query, Employee.class);
    }



}
