import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;

public class StageManager {
    public static void main(String[] args) throws Exception{
        StageManager stageManager = new StageManager();
    }

    public StageManager() {
        //Non-Show Setup
        Console console = new Console();
        Actuatable actuatable = new Actuatable();
        actuatable.setConsole(console);
        //Show Setup
        Show show = new Show();
        PaperworkElement paperworkElement = new PaperworkElement();
        paperworkElement.setShow(show);

    }
}
