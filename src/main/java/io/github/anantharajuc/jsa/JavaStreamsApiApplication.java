package io.github.anantharajuc.jsa;

import io.github.anantharajuc.jsa.domain.model.project.Person;
import io.github.anantharajuc.jsa.util.DataLoad;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@SpringBootApplication
public class JavaStreamsApiApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavaStreamsApiApplication.class, args);
		log.info("Hello Java Streams API");

		List<Person> people = DataLoad.getPeople();
		log.info("people "+people.size());

		log.info("============================== Stream");
		people
				.stream()
				.forEach(System.out::println);

		log.info("============================== Stream, Filter");
		people
				.stream()
				.filter(person -> person.getAge()>99)
				.forEach(System.out::println);

		log.info("============================== Stream, Filter, Limit");
		people
				.stream()
				.filter(person -> person.getAge()>90)
				.limit(5)
				.forEach(System.out::println);

		log.info("============================== Stream, Filter, Limit, Collect");
		List<Person> oldPeople = people
									.stream()
									.filter(person -> person.getAge()>99)
									.limit(2)
									.collect(Collectors.toList());
		oldPeople.stream().forEach(System.out::println);
	}
}
