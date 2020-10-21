public class Image implements Element{
    private String imageName;

    public void print()
    {
        System.out.println("Image with name: " + this.imageName);
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
