package dx.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void cannot_create_with_new() {
//        new Singleton();
    }

    @Test
    void can_create_only_one_instance() {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        assertSame(first, second);
    }
}
