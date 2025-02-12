package unbreakk1;

public record Person(int id, String name, DaysOfWeek favoriteDay, Gender gender)

{
    @Override
    public String toString()
    {
        return "Person [ID=" + id
                + ", Name='" + name + "'"
                + ", Favorite Day=" + favoriteDay
                + ", Gender=" + gender + "]";
    }
}
