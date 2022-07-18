package com.equipobeta.friendzone.events;

import com.equipobeta.friendzone.users.User;
import com.equipobeta.friendzone.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EventController {



    private final UserService userService;
    private final EventService eventService;


    @Autowired
    EventService service;


   

    public EventController(UserService userService, EventService eventService) {
        this.userService = userService;
        this.eventService = eventService;
    }

     //listar todos los eventos
     
    @GetMapping("/api/allevents")
    public List<Event> getall(){
        return service.getAllEvents();
    }


    //borrar un evento por id

    @GetMapping("/api/delete/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.deleteById(id);
        return "redirect:/api/allevents";
    }

    @PostMapping("/api/createevent")
    public Event addEvent(@RequestBody Event event) {
        User authUser = userService.findById(1L);

        event.setUser(authUser);

        return eventService.createEvent(event);
    }




    @PutMapping("/api/update/")
    public String update(@RequestBody Event e){

//        service.getProductById(p.getId());
        service.update(e);


        return "redirect:/api/allevents";
    }

}


