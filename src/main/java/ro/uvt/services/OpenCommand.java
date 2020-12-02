package ro.uvt.services;
import ro.uvt.models.*;

public class OpenCommand implements Command{

    public void execute() {
        Book b1=new Book("Book1");
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        cap1.add(new Paragraph("Paragraph 3"));
        cap1.add(new Table("Table 1"));
        cap1.add(new Table("Table 2"));
        b1.addContent(cap1);

        DocumentManager.getInstance().setBook(b1);
    }
}
