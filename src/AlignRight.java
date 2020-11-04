public class AlignRight implements AlignStrategy {
    @Override
    public Paragraph render(Paragraph p) {
        p.setName("__________" + p.getName());

        return p;
    }
}