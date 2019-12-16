package dx.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegacyRectangleAdaptorTest {

    @Test
    void display() {
        LegacyRectangleAdaptor rectangleAdaptor = new LegacyRectangleAdaptor(new LegacyRectangle());

        displayShape(rectangleAdaptor);
    }

    private void displayShape(Shape shape) {
        shape.display(0, 1, 5, 8);
    }
}
