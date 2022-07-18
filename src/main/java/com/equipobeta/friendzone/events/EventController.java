package com.equipobeta.friendzone.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/update/")
    public String update(@RequestBody Event e){

//        service.getProductById(p.getId());
        service.update(e);

        return "redirect:/api/allevents";
    }

}
