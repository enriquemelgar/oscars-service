package com.aquijemelgar.oscarsservice.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aquijemelgar.oscarsservice.model.Actors;
import com.aquijemelgar.oscarsservice.repository.ActorRepository;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ActorRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(
                    new Actors(1L, "Leonardo DiCaprio", "30", "The Revenant", "Titanic, The Revenant",
                            "Leonardo is an actor that was denied several times of his well deserve prize")));
        };
    }
}
