package com.duecat_java.advancejava.entity;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private double salary;
    private Emp_address address;

    // No-arg constructor required by Hibernate
    public Employee() {
    }

    // Constructor without ID for transient entities
    public Employee(String name, int age, String gender, String department, double salary) {
        this.id = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, int age, String gender, String department, double salary, Emp_address address) {
        this(name, age, gender, department, salary);
        this.address = address;
    }

    // Full constructor (ID may be set manually if needed)
    public Employee(int id, String name, int age, String gender, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp_address getAddress() {
        return address;
    }

    public void setAddress(Emp_address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
