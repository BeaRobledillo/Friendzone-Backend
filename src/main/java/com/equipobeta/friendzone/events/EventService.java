package com.equipobeta.friendzone.events;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){

        this.eventRepository=eventRepository;
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public void deleteById(Long id){
        eventRepository.deleteById(id);
    }
}
