import java.util.ArrayList;

public class Console {
    String currentText;
    ArrayList<String> textToDisplay;
    ArrayList<String> pastActions;

    public Console() {
        textToDisplay = new ArrayList<String>();
    }

    private void displayText() {
        currentText = textToDisplay.get(0);
        textToDisplay.remove(0);
        pastActions.add(currentText);
    }

    public void addMessage(String text) {
        textToDisplay.add(text);
        displayText();
    }
}
