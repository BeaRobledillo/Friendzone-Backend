package com.equipobeta.friendzone.events;

import com.equipobeta.friendzone.auth.security.principal.UserDetailsImpl;
import com.equipobeta.friendzone.users.User;
import com.equipobeta.friendzone.users.UserRepository;
import com.equipobeta.friendzone.users.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EventController {



    private final UserService userService;
    private final EventService eventService;

    private final EventRepository eventRepository;

    private final UserRepository userRepository;



    public EventController(UserService userService, EventService eventService, EventRepository eventRepository, UserRepository userRepository) {
        this.userService = userService;
        this.eventService = eventService;
        this.eventRepository = eventRepository;
        this.userRepository = userRepository;
    }

     //listar todos los eventos
     
//    @GetMapping("/api/allevents")
//    public List<Event> getall(){return eventService.getAllEvents();
//    }

    @GetMapping("/api/allevents")
    public ResponseEntity<List<Event>> getEventByOwner(Authentication authentication, HttpSession session) {
        if (authentication == null) {
            System.out.println("Es necesario que hagas el login");
        }
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            System.out.println(userDetails.getUsername());
            User user = userRepository.getByUsername(userDetails.getUsername());

        return ResponseEntity.ok().body(eventRepository.findAllByOwner(user));
    }


    //borrar un evento por id

    @DeleteMapping("/api/delete/{id}")
    public Long delete(@PathVariable("id") Long id) {
        Event event = eventService.findById(id);
        eventService.deleteById(id);
        return id;
    }



//    public String userAccess() {
//        return "User Content.";
//    }
@PostMapping("/api/createevent")
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<?> addEvent(@RequestBody Event event, Authentication authentication) {
//
        if (authentication == null) {
            System.out.println("Es necesario que hagas el login");
        }

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        System.out.println(userDetails.getUsername());
        User user = userRepository.getByUsername(userDetails.getUsername());

        event.setOwner(user);

        return ResponseEntity.ok().body(eventService.createEvent(event));

    }


    @GetMapping("/api/oneevent/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Event findEventById(@PathVariable Long id) {
        return eventService.findById(id);
    }

    @PutMapping("/api/update/")
    public Event updateEvent(@RequestBody Event event){

        return eventService.updateEvent(event);
    }

}


