package ru.mirea.lab1;

public class Fox {
    private String name;
    private int age;

    public Fox(String new_name, int new_age){
        age = new_age;
        name = new_name;
    }

    public Fox(String new_name){
        age = 0;
        name = new_name;
    }

    public Fox(int new_age){
        age = new_age;
        name = "foxy";
    }

    public Fox(){
        age = 0;
        name = "foxy";
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

    @Override
    public String toString(){
        return "Name: "+this.name+" Age: "+this.age;
    }

    public void toHumanAge(){
        System.out.println(this.name+" "+this.age*5+" years");
    }
}
