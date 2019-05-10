import java.util.ArrayList;

public class Console {
    String currentText;
    ArrayList<String> textToDisplay;
    ArrayList<String> pastActions;
    GUIManager guiManager;

    public Console() {
        currentText = "";
        textToDisplay = new ArrayList<String>();
        pastActions = new ArrayList<String>();
    }

    private void displayText() {
        currentText = textToDisplay.get(0);
        textToDisplay.remove(0);
        pastActions.add(currentText);
        guiManager.getFrame().repaint();
    }

    public void addMessage(String text) {
        textToDisplay.add(text);
        displayText();
    }

    public void setGUIManager(GUIManager guiManager) {
        this.guiManager = guiManager;
    }
}
