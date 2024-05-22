package com.aquijemelgar.oscarsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.aquijemelgar.oscarsservice.model.Actors;

public interface ActorRepository extends MongoRepository<Actors, Long> {
    
}
