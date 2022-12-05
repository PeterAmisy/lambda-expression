package com.peter;

import java.util.ArrayList;
import java.util.List;

public class People {

    private String name;
    int age;
    String email;
    Gender gender;

    public People() {
    }

    public People(String name, int age, String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void printPeople(){
        System.out.println(this.toString());
    }
    public static List<People> defaultList(){
        List<People> people = new ArrayList<>();
        people.add(new People("Nelly",32,"nelly@gmail.com",Gender.FEMALE));
        people.add(new People("Soraya",24,"soraya@gmail.com",Gender.FEMALE));
        people.add(new People("Naima",26,"naima@gmail.com",Gender.FEMALE));
        people.add(new People("Gary",37,"gary@gmail.com",Gender.MALE));
        return people;
    }
}
