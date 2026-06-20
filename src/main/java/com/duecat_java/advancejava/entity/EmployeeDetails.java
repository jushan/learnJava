package com.duecat_java.advancejava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeprofile")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String gender;
    private int age;
    @Column(name = "marital_status")
    private String maritalStatus;
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;

    public EmployeeDetails(){

    }
    public EmployeeDetails(String name, String email, String gender, int age, String maritalStatus, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public String getMaritalStatus(){
        return this.maritalStatus;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setName( String name){
        this.name = name;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public void setGender( String gender){
        this.gender = gender;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setMaritalStatus( String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    public void setAddress( String address){
        this.address = address;
    }
    public void setPhoneNumber( String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
