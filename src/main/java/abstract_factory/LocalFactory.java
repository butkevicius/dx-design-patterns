package abstract_factory;

public class LocalFactory extends AbstractFileSystemFactory {
    @Override
    public Storage createStorage() {
        return new LocalStorage();
    }

    @Override
    public PathResolver createPathResolver() {
        return new LocalPathResolver();
    }
}
