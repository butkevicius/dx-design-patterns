package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemFactoryTest {

    @Test
    void can_create_file_systems_from_factories() {
        FileSystemFactory[] factories = new FileSystemFactory[]{
                new LocalFileSystemFactory(),
                new S3FileSystemFactory(),
        };


        for (FileSystemFactory factory: factories) {
            workWithFileSystem(factory);
        }
    }

    private void workWithFileSystem(FileSystemFactory fileSystemFactory) {
        FileSystem fs = fileSystemFactory.getFileSystem();

        fs.storeFile("file_contents");
        String contents = fs.retrieveFile("file.txt");
        System.out.println(contents);
    }
}
