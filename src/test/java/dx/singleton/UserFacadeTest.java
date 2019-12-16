package dx.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFacadeTest {

    @Test
    void getInstance() {

        UserFacade userFacade1 = UserFacade.getInstance();
        UserFacade userFacade2 = UserFacade.getInstance();

        assertSame(userFacade1, userFacade2);
    }
}
