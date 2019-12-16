package dx.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageFactoryTest {

    @Test
    void createImage() {
        ImageFactory factory = new ImageFactory();

        Image image1 = factory.createImage(1, "small", "0110", "88");
        Image image2 = factory.createImage(2, "big", "0110", "88");

        assertSame(image1.getImageContainer(), image2.getImageContainer());
    }
}
