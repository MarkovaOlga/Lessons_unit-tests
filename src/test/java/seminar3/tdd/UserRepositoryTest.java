package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    UserRepository repository;

    @BeforeEach
    void setup() {
        repository =new UserRepository();
    }
    @Test
    void addUserRepository(){
        User user = new User("1","1", false);
        user.authenticate("1","1");
        repository.addUser(user);
        assertTrue(repository.data.contains(user));
    }
    @Test
    void addNotUserRepository(){
        User user = new User("1","1", false);
        user.authenticate("1","4");
        repository.addUser(user);
        assertFalse(repository.data.contains(user));
    }
}
