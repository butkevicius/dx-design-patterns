package factory;

public interface FileSystem {
    String retrieveFile(String path);
    void storeFile(String contents);
}
