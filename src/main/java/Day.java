public class Day {
    String name;
    int day;
    int month;
    int year;
    boolean withinSevenDaysOfOpening;

    public Day(String name) {
        this.name = name;
    }

    public Day(String name, boolean withinSevenDaysOfOpening) {
        this.name = name;
        this.withinSevenDaysOfOpening = withinSevenDaysOfOpening;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWithinSevenDaysOfOpening() {
        return withinSevenDaysOfOpening;
    }

    public void setWithinSevenDaysOfOpening(boolean withinSevenDaysOfOpening) {
        this.withinSevenDaysOfOpening = withinSevenDaysOfOpening;
    }
}
