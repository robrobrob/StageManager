import java.util.ArrayList;

public class Track {
    ArrayList<TheatricalLocation> locations;
    ArrayList<Person> handledBy;

    public ArrayList<Person> getHandledBy() {
        return handledBy;
    }

    public void setHandledBy(ArrayList<Person> handledBy) {
        this.handledBy = handledBy;
    }
}
