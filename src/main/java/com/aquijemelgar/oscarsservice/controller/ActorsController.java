package com.aquijemelgar.oscarsservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.aquijemelgar.oscarsservice.model.Actors;
import com.aquijemelgar.oscarsservice.repository.ActorRepository;

@RestController
public class ActorsController {
    @Autowired
    private ActorRepository actorsRepository;

    @GetMapping
    List<Actors> all() {
        return actorsRepository.findAll();
    }
}
