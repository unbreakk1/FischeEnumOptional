package unbreakk1;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository
{
    private final List<Person> persons = new ArrayList<>();


    public void addPerson(Person person)
    {
        persons.add(person);
    }

    public List<Person> getAllPersons()
    {
        return new ArrayList<>(persons);
    }

    public List<Person> findByName(String name)
    {
        List<Person> result = new ArrayList<>();
        for (Person person : persons)
        {
            if (person.name().equalsIgnoreCase(name))
                result.add(person);

        }
        return result;
    }
}
