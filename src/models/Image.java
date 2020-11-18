package models;
import services.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String name){
        this.imageName=name;
        try {
            TimeUnit.SECONDS.sleep(5);
            ImageLoaderFactory.create(name);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }

}