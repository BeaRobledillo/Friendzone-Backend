package com.equipobeta.friendzone.events;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class EventServiceTest {

    @Mock private EventRepository eventRepositoryMock;

    private EventService eventServiceUnderTest;

    @BeforeEach
    void setUp() {
        eventServiceUnderTest = new EventService(eventRepositoryMock);
    }

    @Test
    void getAllEvents() {
        eventServiceUnderTest.getAllEvents();
        verify(eventRepositoryMock).findAll();
    }

    @Test
    void deleteById() {
    }

    @Test
    void createEvent() {
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }
}