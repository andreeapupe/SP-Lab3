import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Element> content = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    Book(String title){
        this.title=title;
    }

    public void addContent(Element elm){
        content.add(elm);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void print(){
        System.out.println("Book title: "+this.title);
        printAuthors();
        for(Element i:content){
            i.print();
        }
    }

    private void printAuthors(){
        for (Author i: authors){
            i.print();
        }
    }
}