package io.github.anantharajuc.jsa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MockDataService {

    public List<Person> load() throws IOException, ParseException {
        File file = ResourceUtils.getFile("classpath:MOCK_DATA.json");
        Object object = new JSONParser().parse(new FileReader(file));
        List<Person> personArrayList = new ArrayList<>();
        for (Person entity : jsonToPersonEntity(object.toString())) {
            personArrayList.add(entity);
        }
        return personArrayList;
    }

    public static List<Person> jsonToPersonEntity(String json) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<Person>();
    }
}
