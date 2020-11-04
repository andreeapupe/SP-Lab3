public class AlignCenter implements AlignStrategy {
    @Override
    public Paragraph render(Paragraph p) {
        p.setName("_____" + p.getName() + "_____");

        return p;
    }
}