import java.util.ArrayList;

public class Item {
    static int itemTotal;
    int ID;
    String name;
    TheatricalLocation presetTheatricalLocation;
    TheatricalLocation currentTheatricalLocation;
    String notes;

    public Item() {

    }

    public Item (String name) {
        itemTotal++;
        ID = getItemTotal();
        this.name = name;
    }

    public static int getItemTotal() {
        return itemTotal;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public TheatricalLocation getPresetTheatricalLocation() {
        return presetTheatricalLocation;
    }

    public TheatricalLocation getCurrentTheatricalLocation() {
        return currentTheatricalLocation;
    }

    public String getNotes() {
        return notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresetTheatricalLocation(TheatricalLocation presetTheatricalLocation) {
        this.presetTheatricalLocation = presetTheatricalLocation;
    }

    public void setCurrentTheatricalLocation(TheatricalLocation currentTheatricalLocation) {
        this.currentTheatricalLocation = currentTheatricalLocation;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
