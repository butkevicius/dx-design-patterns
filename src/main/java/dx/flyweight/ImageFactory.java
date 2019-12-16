package dx.flyweight;

import java.util.HashMap;

public class ImageFactory {
    private HashMap<String, ImageContainer> cache = new HashMap<>();

    public Image createImage(int id, String style, String imageData, String dataHash) {
        if (!cache.containsKey(dataHash)) {
            cache.put(dataHash, new ImageContainer(imageData));
        }

        return new Image(cache.get(dataHash), id, style);
    }
}
