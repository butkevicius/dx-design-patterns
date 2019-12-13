package factory;

public class LocalFileSystem implements FileSystem {

    @Override
    public String retrieveFile(String path) {
        return "local file: " + path;
    }

    @Override
    public void storeFile(String contents) {
        System.out.println("Storing local file: " + contents);
    }
}
