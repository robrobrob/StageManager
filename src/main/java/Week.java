import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Week {
    int ID;
    Day[] days = new Day[7];
    boolean performanceWeek;
    boolean rehearsalWeek;
    int lastWeekOfRehearsalOrWeekOfOpeningPlay;
    ArrayList<Boolean> addingPerformance;
    ArrayList<Calendar> addingPerformanceSetDate;

}
