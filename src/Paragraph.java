public class Paragraph implements Element{
    private String name;

    Paragraph(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println("Paragraph with name: "+this.name);
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.name = strategy.render(this).name;
    }
}