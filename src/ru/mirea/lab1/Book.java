package ru.mirea.lab1;

public class Book {
    private String title, author;
    private String text;

    public Book(String title, String author) {
        this.text="";
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.text="";
        this.title = title;
        this.author = "unknown";
    }

    public Book() {
        this.text="";
        this.title = "untitled";
        this.author = "unknown";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addText(String new_text){
        this.text += new_text;
    }

    public void replaceText(String new_text){
        this.text = new_text;
    }

    @Override
    public String toString(){
        return this.title+"\n"+this.text+"\n"+this.author+"\n\n";
    }
}
