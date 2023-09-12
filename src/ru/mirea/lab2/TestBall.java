package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(1.0, 2.0);
        System.out.println(b1.getX()+" "+b1.getY());
        b1.setXY(1.1, 2.2);
        b2.move(1.1, 3.3);
        System.out.println(b1);
        System.out.println(b2);
    }
}
