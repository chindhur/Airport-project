package com.person;

import com.utils.Printer;

public class Person{
    String name;
    Integer age;
    Address address;
    Gender gender;

    String emailId;



    public Person(String name) {
        this.name = name;
    }
    /* Default Constructor */
    public Person() {
    }

    /*constructor*/
    public Person(String name, Integer age,Address address,Gender gender){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void printBasicDetails(){
        Printer.print("Name : " + name);
        Printer.print("Age : " + age);
        return;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }
}