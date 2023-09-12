package ru.mirea.lab1;

public class Ball {
    private String type;
    private int weight;

    public Ball() {
        this.type = "Undefined";
        this.weight = 500;
    }

    public Ball(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public Ball(int weight) {
        this.type = "Undefined";
        this.weight = weight;
    }

    public Ball(String type) {
        this.type = type;
        this.weight = 500;
    }

    @Override
    public String toString(){
        return this.type+" ball, weight: "+this.weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void strike(){
        System.out.println("Boom!");
    }
}
