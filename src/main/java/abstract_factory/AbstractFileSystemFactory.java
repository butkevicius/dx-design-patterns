package abstract_factory;

public abstract class AbstractFileSystemFactory {
    private static final S3Factory S_3_FACTORY = new S3Factory();
    private static final LocalFactory LOCAL_FACTORY = new LocalFactory();

    static AbstractFileSystemFactory getFactory(FSType fsType) {
        AbstractFileSystemFactory factory = null;
        switch (fsType) {
            case LOCAL:
                factory = LOCAL_FACTORY;
                break;
            case S3:
                factory = S_3_FACTORY;
                break;
        }
        return factory;
    }

    public abstract Storage createStorage();
    
    public abstract PathResolver createPathResolver();

    enum FSType {
        LOCAL, S3
    }
}
