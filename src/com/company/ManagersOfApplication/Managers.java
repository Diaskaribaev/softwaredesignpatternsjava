package com.company.ManagersOfApplication;

public abstract class Managers {
    private String name;
    private int age;

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
    public void displayManager(){
        System.out.println(getName() + " appointed to the position, age is " + getAge());
    }




}
