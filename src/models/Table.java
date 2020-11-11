package models;
import services.*;
public class Table implements Element {

    private String name;

    public Table(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("models.Table with name: " + this.name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}