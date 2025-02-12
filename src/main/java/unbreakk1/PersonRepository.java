package unbreakk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository
{
    private final List<Person> persons = new ArrayList<>();

    // Method to add a person
    public void addPerson(Person person) {
        persons.add(person);
    }

    // Method to retrieve all persons
    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }

    // Method to find a person by id
    public Optional<Person> findById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }



}
