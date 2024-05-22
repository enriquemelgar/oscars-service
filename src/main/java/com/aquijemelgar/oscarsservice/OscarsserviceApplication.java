package com.aquijemelgar.oscarsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.aquijemelgar.oscarsservice.repository.ActorRepository;

@EnableMongoRepositories
@SpringBootApplication
public class OscarsserviceApplication {

	@Autowired
	ActorRepository actorsRepository;

	public static void main(String[] args) {
		SpringApplication.run(OscarsserviceApplication.class, args);
	}

}
