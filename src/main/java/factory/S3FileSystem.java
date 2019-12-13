package factory;

public class S3FileSystem implements FileSystem {
    @Override
    public String retrieveFile(String path) {
        return "s3 file: " + path;
    }

    @Override
    public void storeFile(String contents) {
        System.out.println("Storing s3 file: " + contents);
    }
}
