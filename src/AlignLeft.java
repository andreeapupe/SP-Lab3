public class AlignLeft implements AlignStrategy {
    @Override
    public Paragraph render(Paragraph p) {
        p.setName(p.getName() + "__________");

        return p;
    }
}