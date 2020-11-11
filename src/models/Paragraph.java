package models;
import services.*;
import services.AlignStrategy;

public class Paragraph implements Element {
    private String name;
    private AlignStrategy strategy;

    public Paragraph(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        if (strategy == null) {
            System.out.println("models.Paragraph with name: "+this.name);
        }
        else{
            strategy.render(this);
        }

    }

    @Override
    public void accept(Visitor visitor) {

    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }
}