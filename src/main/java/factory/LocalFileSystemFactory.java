package factory;

public class LocalFileSystemFactory implements FileSystemFactory {
    @Override
    public FileSystem getFileSystem() {
        return new LocalFileSystem();
    }
}
