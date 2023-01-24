package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private String city;
    private int age;

    public Person(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId(Integer id) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity(String city) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
    public Person(){

    }
}
