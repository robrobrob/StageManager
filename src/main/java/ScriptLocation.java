import java.util.ArrayList;

public class ScriptLocation extends BookElement implements hasConsoleAccess{
    Console console;
    Line line;
    int charactersIntoLine;
    ScriptLocationType type;
    ArrayList<Action> actions;
    ActionManager actionManager;

    public ScriptLocation (Console console, Script script, Line line, int charactersIntoLine, ScriptLocationType type) {
        this.line = line;
        this.charactersIntoLine = charactersIntoLine;
        this.type = type;
        actionManager = new ActionManager(console);
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    @Override
    public Console getConsole() {
        return console;
    }
}
