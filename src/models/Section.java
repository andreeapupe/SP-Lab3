package models;
import services.*;
import java.util.Vector;

public class Section implements Element {
    String sectionTitle;
    Vector<Element> content = new Vector<Element>();



    public int add(Element element) {
        content.add(element);
        return content.size();
    }
    void remove(Element element) {
        for(Element i: content) {
            content.remove(i);
        }
    }

    Element getElement(int index) {
        return content.get(index);
    }

    @Override
    public void print() {
        System.out.println(sectionTitle);
        for(Element i: content) {
            i.print();
        }
    }
    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element i:content) {
            i.accept(visitor);
        }
    }

}