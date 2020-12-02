package ro.uvt.models;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }
    public void print()
    {
        System.out.println("main.java.ro.uvt.models.Author: " + this.name);
    }


}
