package com.equipobeta.friendzone.users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    private UserService underTest;


    @BeforeEach
    void setUp() {
        underTest = new UserService(userRepository);
    }
    @Test
    void findById() {
        //When
        User user = new User(
                "Bea",
                "BeaBootcamp",
                "bea@gmail.com",
                "123456"
        );
        //Then
        userRepository.findById(1L);
        verify(userRepository).findById(1L);

    }


}