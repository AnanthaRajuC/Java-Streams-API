package io.github.anantharajuc.jsa;

import lombok.extern.log4j.Log4j2;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
@SpringBootApplication
public class JavaStreamsApiApplication {

	public static void main(String[] args) throws IOException, ParseException {
		SpringApplication.run(JavaStreamsApiApplication.class, args);
		log.info("Hello Java Streams API");

		MockDataService mockDataService = new MockDataService();
		List<Person> personList =  mockDataService.load();

		log.info(personList.size());

		/*Filter, Fetch & Collect*/
		List<Integer> nameLemmy = personList.stream()
								.filter(p -> p.first_name.equalsIgnoreCase("Lemmy")) // filtering data
								.map(p->p.id)                         							 // fetching id
								.collect(Collectors.toList());        							 // collecting as list

		log.info(nameLemmy.size());

		Stream.iterate(1, element->element+1)
				.filter(element->element%5==0)
				.limit(5)
				.forEach(System.out::println);

		personList.stream()
				.filter(person -> person.getGender().equalsIgnoreCase("Female"))
				.limit(3)
				.forEach(person -> System.out.println(person.first_name));
	}
}
