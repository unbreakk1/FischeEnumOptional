package unbreakk1;

public enum DaysOfWeek
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static String getDayType(DaysOfWeek day)
    {
        return switch (day)
        {
            case SATURDAY, SUNDAY -> "Weekend";
            default -> day.name();
        };
    }
}


