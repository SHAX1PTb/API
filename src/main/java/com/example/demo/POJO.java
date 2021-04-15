package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class POJO {
    @JsonIgnoreProperties
    String Name;
    @JsonIgnoreProperties
    String Lastname;
    @JsonIgnoreProperties
    String age;
    @JsonIgnoreProperties
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAge() {
        return age;
    }
}
