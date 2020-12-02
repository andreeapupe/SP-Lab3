package ro.uvt.services;

public class AlignLeft implements AlignStrategy {

    public void render(String paragraph) {
        System.out.println("++++++" + paragraph);
    }
}