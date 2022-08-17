package com.equipobeta.friendzone.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class UsersServiceTest {

    @Mock
    private UsersRepository usersRepositoryMock;

    private UsersService usersServiceUnderTest;

    @BeforeEach
    void setUp() {
        usersServiceUnderTest = new U(usersRepositoryMock);
    }

    @Test
    void () {
        usersServiceUnderTest.();
        verify(usersRepositoryMock).();
    }

    @Test
    void () {
    }
}