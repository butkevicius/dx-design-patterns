package dx.flyweight;

public class Image {
    private int id;
    private ImageContainer imageContainer;
    private String style;

    public Image(ImageContainer imageContainer, int id, String style) {
        this.imageContainer = imageContainer;
        this.id = id;
        this.style = style;
    }

    public ImageContainer getImageContainer() {
        return imageContainer;
    }
}
