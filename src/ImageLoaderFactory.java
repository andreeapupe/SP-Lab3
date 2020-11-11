import services.BMPImageLoader;
import services.JPGImageLoader;
import services.PNGImageLoader;

import java.io.IOException;

public class ImageLoaderFactory {

    public static void create(String url) throws IOException {
        if (url.toLowerCase().endsWith("bmp")) {
            BMPImageLoader.load(url);
        }
        else if (url.toLowerCase().endsWith("jpg")) {
            JPGImageLoader.load(url);
        }
        else if (url.toLowerCase().endsWith("png")) {
            PNGImageLoader.load(url);
        }else {
            throw new RuntimeException("Unsupported format: " + url);
        }
    }

}