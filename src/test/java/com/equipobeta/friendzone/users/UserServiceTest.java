package com.equipobeta.friendzone.users;

import com.equipobeta.friendzone.events.EventRepository;
import com.equipobeta.friendzone.events.EventService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class UsersServiceTest {

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
                1L,
                "Bea",
                "bea@gmail.com",
                "123456",
                "BeaBootcamp"
        );
        //Then
        userRepository.findById(1L);
        verify(userRepository).findById(1L);

    }


}