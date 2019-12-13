package dx.abstract_factory;

public class S3Factory extends AbstractFileSystemFactory {
    @Override
    public Storage createStorage() {
        return new S3Storage();
    }

    @Override
    public PathResolver createPathResolver() {
        return new S3PathResolver();
    }
}
