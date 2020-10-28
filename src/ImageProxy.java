public class ImageProxy implements Element{

    private String name;
    Image realImage=null;

    ImageProxy(String name){
        this.name=name;
    }

    public void print() {
        if(realImage==null){
            realImage = new Image(this.name);
        }
        realImage.print();
    }
}