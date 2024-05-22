package com.aquijemelgar.oscarsservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class OscarsserviceApplicationTests {

	// @Test
	// void whenPropertiesConfig_thenInsertSucceeds() {
	// 	SpringApplicationBuilder app = new SpringApplicationBuilder(OscarsserviceApplication.class);
	// 	app.run();
	// 	String name = "Christian";
	// 	MongoTemplate mongo = app.context().getBean(MongoTemplate.class);
	// 	Document doc = Document.parse("{\"name\":\"" + name + "\"}");
	// 	Document inserted = mongo.insert(doc, "items");

	// 	assertNotNull(inserted.get("_id"));
	// 	assertEquals(inserted.get("name"), name);
	// }

}
