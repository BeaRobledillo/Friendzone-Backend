package com.equipobeta.friendzone.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EventController {

    @Autowired
    EventService service;

    @GetMapping("/api/allevents")
    public List<Event> getall(){
        return service.getAllEvents();
    }

}
