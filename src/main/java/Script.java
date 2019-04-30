import java.util.ArrayList;

public class Script extends Paperwork implements hasConsoleAccess{
    Console console;
    ArrayList<LineLocation> lineLocations;
    ArrayList<Line> lines;
    ArrayList<ScriptLocation> scriptLocations;

    public Script(Console console) {
        this.console = console;
    }

    @Override
    public Console getConsole() {
        return console;
    }
}
