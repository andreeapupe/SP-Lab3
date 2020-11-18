package models;
import services.*;
public class ImageProxy implements Element {

    private String name;
    Image realImage=null;

    public ImageProxy(String name){
        this.name=name;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public void print() {
        if(realImage==null){
            realImage = new Image(this.name);
        }
        realImage.print();
    }


}