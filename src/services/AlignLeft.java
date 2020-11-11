package services;
import models.*;
public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph p) {
        System.out.println("++++++" + p .getName());
    }
}