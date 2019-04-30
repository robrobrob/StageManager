import java.util.ArrayList;

public class Action implements hasConsoleAccess{
    Console console;
    ScriptLocation scriptLocation;
    ActionType actionType;
    TheatricalLocation location;
    String name;
    boolean displayName;
    int priority;

    public Action() {

    }

    public Action(Console console, ScriptLocation scriptLocation, ActionType type) {
        this.console = console;
        this.scriptLocation = scriptLocation;
        this.actionType = type;
    }

    public Action(Console console, ScriptLocation scriptLocation, ActionType type, TheatricalLocation location) {
        this.console = console;
        this.scriptLocation = scriptLocation;
        this.actionType = type;
        this.location = location;
    }

    public Action(Console console, ScriptLocation scriptLocation, ActionType type, String name) {
        this.console = console;
        this.scriptLocation = scriptLocation;
        this.actionType = type;
        this.name = name;
    }

    public Action(Console console, ScriptLocation scriptLocation, ActionType type, String name, TheatricalLocation location) {
        this.console = console;
        this.scriptLocation = scriptLocation;
        this.actionType = type;
        this.name = name;
        this.location = location;
    }

    //Getters

    /**
     * Returns the location at which the action occurs
     * @return location of action
     */

    public TheatricalLocation getLocation() {
        return location;
    }

    /**
     * Returns the name of the action
     * @return name of action
     */

    public String getName() {
        return name;
    }

    /**
     * Returns whether to display the name of the action
     * @return whether the name is displayed
     */

    public boolean isDisplayName() {
        return displayName;
    }

    /**
     * Returns the priority within a multi-thread step
     * @return priority of action
     */

    public int getPriority() {
        return priority;
    }

    /**
     * Sets the name of the action
     * @param name String name of the action
     */

    private void setName(String name) {
        this.name = name;
    }

    /**
     * Sets whether to display the name of the action in a document
     * @param displayName if true, display the name of the action in a document
     */

    public void setDisplayName(boolean displayName) {
        this.displayName = displayName;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void generateName(){

    }

    @Override
    public Console getConsole() {
        return getConsole();
    }
}
