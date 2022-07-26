package com.equipobeta.friendzone.events;

import com.equipobeta.friendzone.exceptions.EventNotFoundException;
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
        eventRepository.deleteById(id);
    }


        public Event createEvent (Event event){

            return eventRepository.save(event);

        }

        public Event updateEvent (Event event){
            Event oldEvent = eventRepository.findById(event.getId()).orElseThrow(()->
                    new RuntimeException("Event not found"));
            oldEvent.setName(event.getName());
            oldEvent.setLocation(event.getLocation());
            oldEvent.setEvent_date(event.getEvent_date());
            oldEvent.setBudget(event.getBudget());
            oldEvent.setDescription(event.getDescription());
            oldEvent.setImage(event.getImage());
            oldEvent.setHour(event.getHour());


            return eventRepository.save(oldEvent);

        }

        public Event findById (Long id) {
            return eventRepository.findById(id).orElseThrow(EventNotFoundException::new);
        }

    }


