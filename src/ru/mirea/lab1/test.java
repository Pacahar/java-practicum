package ru.mirea.lab1;

public class test {
    public static void main(String[] args) {
        Fox f1 = new Fox();
        Fox f2 = new Fox("Albert", 10);
        Fox f3 = new Fox("Michael");
        System.out.println(f2);
        System.out.println(f3);
        f1.toHumanAge();

        System.out.println();

        Ball b1 = new Ball();
        Ball b2 = new Ball("Basket");
        Ball b3 = new Ball("Foot", 570);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b3.strike();

        System.out.println();

        Book book1 = new Book();
        Book book2 = new Book("Capitan's daughter");
        Book book3 = new Book("Alice in Wonderland", "Lewis Carroll");
        book1.setTitle("Bible");
        book1.addText("abc");
        System.out.println(book1);
        book1.addText("def");
        System.out.println(book1);
        book1.replaceText("cba");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
