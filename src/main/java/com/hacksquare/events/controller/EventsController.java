package com.hacksquare.events.controller;

import com.hacksquare.events.model.Events;
import com.hacksquare.events.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventRepo eventRepo;

    @GetMapping("/all")
    public List<Events> getAllEvents() {
        return eventRepo.findAll();
    }

    @GetMapping("/{id}")
    public Events getEventsById(@PathVariable int id) {
        return eventRepo.findById(id);
    }

    @PostMapping(value = "/add")
    public void createEvent(@Valid @RequestBody Events events) {
        eventRepo.save(events);
    }



}
