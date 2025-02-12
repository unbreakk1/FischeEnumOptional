package unbreakk1;

import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        PersonRepository repository = new PersonRepository();

        repository.addPerson(new Person(1, "Alice", DaysOfWeek.FRIDAY, Gender.FEMALE));
        repository.addPerson(new Person(2, "Bob", DaysOfWeek.MONDAY, Gender.MALE));
        repository.addPerson(new Person(3, "Chris", DaysOfWeek.WEDNESDAY, Gender.DIVERSE));

        int searchId = 1;

        Optional<Person> person = repository.findById(searchId);

        person.ifPresentOrElse(
                p -> {
                    System.out.println("Person found:");
                    System.out.println(p);
                    System.out.println("Name: " + p.name());
                    System.out.println("Favorite Day: " + p.favoriteDay());
                    System.out.println("Gender: " + p.gender());
                },
                () -> System.out.println("Person with ID " + searchId + " not found.")
        );

        System.out.println("\nAll persons in the repository:");
        for (Person p : repository.getAllPersons()) {
            System.out.println(p);
        }


    }
}
