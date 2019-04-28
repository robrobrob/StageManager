import java.util.ArrayList;

/**
 * This class is responsible for the location of each line.
 * If the line were to be deleted, the line location could be made to take up no space on the page but it will still exist.
 * Because it does not delete, even when a line is removed, it can still be localized to a page.
 * Also, this allows a line location to hold more than one line. With this, more than one line can be at the same location.
 */

public class LineLocation extends BookElement{
    ArrayList<Line> line;
    int [] speakingTract;
    boolean [] displayLine;

}
