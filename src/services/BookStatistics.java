package services;

import models.*;

public class BookStatistics implements Visitor {
    private int imagesProxy = 0;
    private int paragraphs = 0;
    private int tables = 0;
    private int sections = 0;
    private int images = 0;

    public void printStatistics() {
        System.out.println("\nImagesProxy: " +
                imagesProxy + "\nParagraphs: " +
                paragraphs + "\nTables: " +
                tables + "\nSections: " +
                sections + "\nImages: " +
                images);
    }

    @Override
    public void visit(Image image) { images++; }

    @Override
    public void visit(ImageProxy imageProxy) { imagesProxy++; }

    @Override
    public void visit(Paragraph paragraph) { paragraphs++; }

    @Override
    public void visit(Table table) { tables++; }

    @Override
    public void visit(Section section) { sections++; }

    public BookStatistics() { }
}