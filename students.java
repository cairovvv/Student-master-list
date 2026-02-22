package com.mycompany.main1;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int yearLvl;
    private String course;
    private String bloodType;
    private String address;
    private int contact;

    public Student(int id, String firstName, String lastName, int age, String gender, 
                   int yearLvl, String course, String bloodType, String address, int contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.yearLvl = yearLvl;
        this.course = course;
        this.bloodType = bloodType;
        this.address = address;
        this.contact = contact;
    }

    public int getID() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public int getYearLvl() { return yearLvl; }
    public String getCourse() { return course; }
    public String getBloodtype() { return bloodType; }
    public String getAddress() { return address; }
    public int getContact() { return contact; }
}