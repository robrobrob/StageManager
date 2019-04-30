import java.util.ArrayList;

public class Blocking extends Action implements hasConsoleAccess{
    Console console;
    ArrayList<Character> characters;
    ArrayList<Item> items;
    ArrayList<BlockingType> type;

    public Blocking(Console console) {
        this.console = console;
    }

}
