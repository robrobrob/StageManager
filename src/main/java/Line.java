import java.util.ArrayList;

public class Line extends Text{
    ArrayList<Character> speakers;
    ArrayList<LinePortion> linePortions;
    boolean multipleSpeakers;

    public String getText() {
        return text;
    }

    public ArrayList<Character> getSpeakers() {
        return speakers;
    }

    public ArrayList<LinePortion> getLinePortions() {
        return linePortions;
    }

    public boolean hasMultipleSpeakers() {
        return multipleSpeakers;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSpeakers(ArrayList<Character> speakers) {
        this.speakers = speakers;
        update();
    }

    public void setLinePortions(ArrayList<LinePortion> linePortions) {
        this.linePortions = linePortions;
    }

    public void setMultipleSpeakers(boolean multipleSpeakers) {
        this.multipleSpeakers = multipleSpeakers;
    }

    public void update() {
        if(speakers.size() > 1) {
            multipleSpeakers = true;
        } else
            multipleSpeakers = false;
    }
}
