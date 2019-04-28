import java.util.ArrayList;
import java.util.Calendar;

public class Show {
    String name;
    boolean LORT;
    boolean musical;
    Calendar startDate;
    Calendar endDate;
    Calendar techDate;
    Calendar openingDate;
    int numPerformances;
    int numRehearsals;
    ArrayList<Person> people;
    ArrayList<Person> cast;
    Book book;

    public Show() {

    }

    public Show(String name, boolean LORT, boolean musical, Calendar startDate) {
        this.name = name;
        this.LORT = LORT;
        this.musical = musical;
        this.startDate = startDate;
    }

    //Getters

    public String getName() {
        return name;
    }

    public boolean isLORT() {
        return LORT;
    }

    public boolean isMusical() {
        return musical;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public Calendar getTechDate() {
        return techDate;
    }

    public Calendar getOpeningDate() {
        return openingDate;
    }

    public int getNumPerformances() {
        return numPerformances;
    }

    public int getNumRehearsals() {
        return numRehearsals;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Person> getCast() {
        return cast;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLORT(boolean LORT) {
        this.LORT = LORT;
    }

    public void setMusical(boolean musical) {
        this.musical = musical;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public void setTechDate(Calendar techDate) {
        this.techDate = techDate;
    }

    public void setOpeningDate(Calendar openingDate) {
        this.openingDate = openingDate;
    }

    public void setNumPerformances(int numPerformances) {
        this.numPerformances = numPerformances;
    }

    public void setNumRehearsals(int numRehearsals) {
        this.numRehearsals = numRehearsals;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void setCast(ArrayList<Person> cast) {
        this.cast = cast;
    }
}
