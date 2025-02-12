package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {
        PersonRepository repository = new PersonRepository();

        repository.addPerson(new Person(1, "Alice", DaysOfWeek.FRIDAY));
        repository.addPerson(new Person(2, "Bob", DaysOfWeek.MONDAY));

        repository.findById(1).ifPresent(person -> System.out.println("Found: " + person));

        repository.findById(3).ifPresentOrElse(
                person -> System.out.println("Found: " + person),
                () -> System.out.println("Person not found")
        );
    }


}
