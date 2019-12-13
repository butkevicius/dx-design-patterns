package factory;

public class S3FileSystemFactory implements FileSystemFactory {
    @Override
    public FileSystem getFileSystem() {
        return new S3FileSystem();
    }
}
