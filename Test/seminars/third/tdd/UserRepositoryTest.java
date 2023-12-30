package seminars.third.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        User first = new User("first","first",false);
        User second = new User("second","second",false);
        User third = new User("third","third",true);

        userRepository = new UserRepository();
        userRepository.addUser(first);
        userRepository.addUser(second);
        userRepository.addUser(third);
    }

    @Test
    void testRemoveAllNotAdmin() {
        userRepository.removeAllNotAdmin();
        assertFalse(userRepository.findByName("first"));
        assertFalse(userRepository.findByName("second"));
        assertTrue(userRepository.findByName("third"));
    }
}
