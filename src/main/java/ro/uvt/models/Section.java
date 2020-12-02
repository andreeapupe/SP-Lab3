package ro.uvt.models;
import java.util.Vector;

public class Section implements Element {
    protected String sectionTitle;
    protected Vector<Element> content = new Vector<Element>();


    public int add(Element element) {
        content.add(element);
        return content.indexOf(element);
    }
    void remove(Element element) {
            content.remove(element);
    }

    public Element getElement(int index) {
        return content.get(index);
    }

    @Override
    public void print() {
        System.out.println("Section: " + sectionTitle);
        for(Element i: content) {
            i.print();
        }
    }
    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element i:content) {
            i.accept(visitor);
        }
    }

}