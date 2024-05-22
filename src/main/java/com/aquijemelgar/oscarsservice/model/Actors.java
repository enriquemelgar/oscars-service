package com.aquijemelgar.oscarsservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public record Actors(@Id @GeneratedValue Long id, String name, String age, String nominatedInMovie, String movies,
        String description) {

}
