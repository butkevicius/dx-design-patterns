package dx.adapter;

public class LegacyRectangleAdaptor implements Shape {

    private LegacyRectangle rectangle;

    public LegacyRectangleAdaptor(LegacyRectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void display(int x1, int y1, int x2, int y2) {
        rectangle.show(x1, y1, x2 - x1, y2 - y1);
    }
}
