package unbreakk1;

import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        PersonRepository repository = new PersonRepository();

        repository.addPerson(new Person(1, "Alice", DaysOfWeek.FRIDAY));
        repository.addPerson(new Person(2, "Bob", DaysOfWeek.MONDAY));

        int searchId = 1;

        Optional<Person> person = repository.findById(searchId);

        if (person.isPresent())
        {
            System.out.println("Name: " + person.get().name());
            System.out.println("Favorite Day: " + person.get().favoriteDay());
        } else
            System.out.println("Person with ID " + searchId + " not found.");

    }
}
