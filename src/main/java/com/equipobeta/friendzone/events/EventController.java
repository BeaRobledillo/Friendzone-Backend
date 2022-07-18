package com.equipobeta.friendzone.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EventController {



    @Autowired
    EventService service;

    //listar todos los eventos
    @GetMapping("/api/allevents")
    public List<Event> getall(){
        return service.getAllEvents();
    }

    //borrar un evento por id

    @GetMapping("/api/delete/{id}")
    public String delete(@PathVariable("id") Long id){

        service.deleteById(id);

        return "redirect:/api/allevents";
    }

}


