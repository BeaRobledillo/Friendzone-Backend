package com.equipobeta.friendzone.events;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;


    public EventService(EventRepository eventRepository) {

        this.eventRepository = eventRepository;

    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }


    public void deleteById(Long id) {
        eventRepository.deleteById(id); }


        public Event createEvent (Event event){

            return eventRepository.save(event);

        }

        public Event update (Event event){

            return eventRepository.save(event);

        }

    public Event findById (Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    }


