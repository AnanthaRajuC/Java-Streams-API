package io.github.anantharajuc.jsa;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class JavaStreamsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStreamsApiApplication.class, args);
		log.info("Hello Java Streams API");
	}
}
