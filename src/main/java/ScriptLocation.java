import java.util.ArrayList;

public class ScriptLocation extends BookElement{
    Line line;
    int charactersIntoLine;
    ScriptLocationType type;
    ArrayList<Action> actions;
    ActionManager actionManager;

    public ScriptLocation (Script script, Line line, int charactersIntoLine, ScriptLocationType type) {
        this.line = line;
        this.charactersIntoLine = charactersIntoLine;
        this.type = type;
        actionManager = new ActionManager();
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

}
