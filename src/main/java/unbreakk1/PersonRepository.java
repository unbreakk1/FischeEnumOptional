package unbreakk1;

import java.util.*;

public class PersonRepository
{
    private final List<Person> persons = new ArrayList<>();

    public void addPerson(Person person)
    {
        persons.add(person);
    }

    public List<Person> getAllPersons() {return new ArrayList<>(persons);}

    public Optional<Person> findById(int id)
    {
        for (Person person : persons)
        {
            if (person.id() == id)
                return Optional.of(person);
        }
        return Optional.empty();
    }

    public void countByGender()
    {
        Map<Gender, Long> genderCounts = new HashMap<>();

        for (Person person : persons)
        {
            genderCounts.put(person.gender(), genderCounts.getOrDefault(person.gender(), 0L) + 1);
        }

        System.out.println("Count of persons by gender:");
        for (Map.Entry<Gender, Long> entry : genderCounts.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Optional<Person> findByName(String name)
    {
        for (Person person : persons)
        {
            if (person.name().equalsIgnoreCase(name))
                return Optional.of(person);
        }
        return Optional.empty();
    }

    public List<Person> findAllByFavoriteDay(DaysOfWeek favoriteDay)
    {
        List<Person> result = new ArrayList<>();
        for (Person person : persons)
        {
            if (person.favoriteDay() == favoriteDay)
                result.add(person);

        }
        return result;
    }

}
