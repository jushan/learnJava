// package com.duecat_java.advancejava.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.GenerationType;

// @Entity
// public class Employee {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;
//     private String name;
//     private int age;
//     private String gender;
//     private String department;
//     private double salary;

//     // No-arg constructor required by Hibernate
//     public Employee() {
//     }

//     // Constructor without ID for transient entities
//     public Employee(String name, int age, String gender, String department, double salary) {
//         this.id = 0;
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//         this.department = department;
//         this.salary = salary;
//     }

//     // Full constructor (ID may be set manually if needed)
//     public Employee(int id, String name, int age, String gender, String department, double salary) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//         this.department = department;
//         this.salary = salary;
//     }

//     // Getters and Setters
//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getGender() {
//         return gender;
//     }

//     public void setGender(String gender) {
//         this.gender = gender;
//     }

//     public String getDepartment() {
//         return department;
//     }

//     public void setDepartment(String department) {
//         this.department = department;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setSalary(double salary) {
//         this.salary = salary;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Employee{" +
//                 "id=" + id +
//                 ", name='" + name + '\'' +
//                 ", age=" + age +
//                 ", gender='" + gender + '\'' +
//                 ", department='" + department + '\'' +
//                 ", salary=" + salary +
//                 ", age=" + age +
//                 '}';
//     }
// }
