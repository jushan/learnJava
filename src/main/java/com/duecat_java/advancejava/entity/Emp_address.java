package com.duecat_java.advancejava.entity;

public class Emp_address {
    private int id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    public Emp_address() {
    }
    public Emp_address(int id, String street, String city, String state, String zipCode, String country) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getCountry() {
        return country;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String toString() {
        return "Emp_address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
