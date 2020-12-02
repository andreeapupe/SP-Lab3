package ro.uvt.services;

public class AlignCenter implements AlignStrategy {

    public void render(String paragraph) {
        System.out.println("+++++" + paragraph +"++++++" );
    }
}