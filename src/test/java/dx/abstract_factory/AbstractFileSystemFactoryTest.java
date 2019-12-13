package dx.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFileSystemFactoryTest {

    @Test
    void can_create_factory_by_fs_type() {
        AbstractFileSystemFactory factory = AbstractFileSystemFactory.getFactory(AbstractFileSystemFactory.FSType.S3);

        PathResolver pathResolver = factory.createPathResolver();
        Storage storage = factory.createStorage();

        assertTrue(pathResolver instanceof S3PathResolver);
        assertTrue(storage instanceof S3Storage);
    }
}
