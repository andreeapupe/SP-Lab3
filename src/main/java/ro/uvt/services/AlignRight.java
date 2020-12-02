package ro.uvt.services;

public class AlignRight implements AlignStrategy {
    public void render(String paragraph) {
        System.out.println(paragraph +"++++++" );
    }
}