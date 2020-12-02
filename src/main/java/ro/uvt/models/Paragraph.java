package ro.uvt.models;
import ro.uvt.services.*;

public class Paragraph implements Element {
    private String name;
    private AlignStrategy alignStrategy;

    public Paragraph(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        if (alignStrategy == null) {
            System.out.println(this.name);
        }
        else{
            alignStrategy.render(this.name);
        }

    }


    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = alignStrategy;
    }
}