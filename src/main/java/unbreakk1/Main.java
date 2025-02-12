package unbreakk1;

import java.util.List;
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
                p ->
                {
                    System.out.println("Person found:");
                    System.out.println(p);
                    System.out.println("Name: " + p.name());
                    System.out.println("Favorite Day: " + p.favoriteDay());
                    System.out.println("Gender: " + p.gender());
                },
                () -> System.out.println("Person with ID " + searchId + " not found.")
        );

        System.out.println("\nAll persons in the repository:");
        for (Person p : repository.getAllPersons())
        {
            System.out.println(p);
        }

        //clear list for Bonus Part
        repository = new PersonRepository();










        //=================================BONUS DONT LOOK AAAAHHH=========================

        repository.addPerson(new Person(1, "Alice", DaysOfWeek.FRIDAY, Gender.FEMALE));
        repository.addPerson(new Person(2, "Bob", DaysOfWeek.MONDAY, Gender.MALE));
        repository.addPerson(new Person(3, "Chris", DaysOfWeek.WEDNESDAY, Gender.DIVERSE));
        repository.addPerson(new Person(4, "Diana", DaysOfWeek.TUESDAY, Gender.FEMALE));
        repository.addPerson(new Person(5, "Eve", DaysOfWeek.THURSDAY, Gender.DIVERSE));

        repository.countByGender();

        String searchName = "alice";
        Optional<Person> foundPerson = repository.findByName(searchName);

        if (foundPerson.isPresent())
            System.out.println("Person found: " + foundPerson.get());
        else
            System.out.println("No person found with the name: " + searchName);

        DaysOfWeek searchDay = DaysOfWeek.FRIDAY;
        List<Person> personsByFavoriteDay = repository.findAllByFavoriteDay(searchDay);

        System.out.println("Persons whose favorite day is " + searchDay + ":");
        if (personsByFavoriteDay.isEmpty())
            System.out.println("No persons found with " + searchDay + " as their favorite day.");
        else
        {
            for (Person personWeekday : personsByFavoriteDay)
            {
                System.out.println(personWeekday);
            }
         }
    }
}
