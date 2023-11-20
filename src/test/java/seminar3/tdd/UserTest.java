package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private User user;

    @BeforeEach
    void setup(){
        user =new User("Roma", "testpass", true);
    }
    @Test
    void authenticationTestPass(){
        assertTrue(user.authenticate("Roma", "testpass"));
    }
    @Test
    void authenticationTestFailed(){
        assertFalse(user.authenticate("admin", "123456"));
    }
}
