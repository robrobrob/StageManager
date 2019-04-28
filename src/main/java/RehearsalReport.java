import java.time.LocalDate;
import java.util.ArrayList;

public class RehearsalReport {
    int ID;
    LocalDate date;
    String summary;
    ArrayList<MeetingLocation> locations;
    ArrayList<Note> notes;
    ArrayList<Department> sectionsPresent;

    public RehearsalReport(int ID, LocalDate date, ArrayList<Department> sectionsPresent){
        this.ID = ID;
        this.date = date;
        this.sectionsPresent = sectionsPresent;
    }

    //Getters

    public int getID() {
        return ID;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSummary() {
        return summary;
    }

    public ArrayList<MeetingLocation> getLocation() {
        return locations;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public ArrayList<Department> getSectionsPresent() {
        return sectionsPresent;
    }

    //Setters

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setSectionsPresent(ArrayList<Department> sectionsPresent) {
        this.sectionsPresent = sectionsPresent;
    }

    //Helpers

    public void addLocation(MeetingLocation location){
        locations.add(location);
    }

    public void removeLocation(MeetingLocation location){
        locations.remove(location);
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public void removeNote(Note note){
        notes.remove(note);
    }
}
