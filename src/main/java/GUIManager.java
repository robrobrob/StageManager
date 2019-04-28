import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Vector;

public class GUIManager {
    public GUIManager(){
        //Window Setup
        JFrame frame = new JFrame("Stage Manager");
        frame.setBounds(100,100,1000,1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        //JMenuBar Setup
        JMenuBar menuBar = new JMenuBar();
        //JMenus Setup
            //File Menu Setup
        JMenu fileMenu = new JMenu("File");
                //New Menu Setup
        JMenu newMenu = new JMenu("New");
                    //New Menu Items Setup
        JMenuItem showMenuItem = new JMenuItem("Show");
        showMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File showFile = new File("");
            }
        });
                        //Document Menu Setup
        JMenu documentMenu = new JMenu("Document");
                            //Document Menu Items Setup
        JMenuItem scriptMenuItem = new JMenuItem("Script");
        JMenuItem runSheetMenuItem = new JMenuItem("Run Sheet");
        JMenuItem propListMenuItem = new JMenuItem("Prop List");
        JMenuItem sceneBySceneMenuItem = new JMenuItem("Scene by Scene");
        JMenuItem pageByPageMenuItem = new JMenuItem("Page by Page");
        JMenuItem contactSheet = new JMenuItem("Contact Sheet");
        JMenuItem dailySchedule = new JMenuItem("Daily Schedule");
        JMenuItem rehearsalReport = new JMenuItem("Rehearsal Report");
        documentMenu.add(scriptMenuItem);
        documentMenu.add(runSheetMenuItem);
        documentMenu.add(propListMenuItem);
        documentMenu.add(sceneBySceneMenuItem);
        documentMenu.add(pageByPageMenuItem);
        documentMenu.add(contactSheet);
        documentMenu.add(dailySchedule);
        documentMenu.add(rehearsalReport);
                            //End Document Menu Items Setup
                        //End Document Menu Setup
        newMenu.add(showMenuItem);
        newMenu.add(documentMenu);
                    //End New Menu Items Setup
        fileMenu.add(newMenu);
                //End New Menu Setup
                //Save Menu Setup
        JMenu saveMenu = new JMenu("Save");
                    //Save Menu Items Setup
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As...");

            //End File Menu Setup
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        //JPanel Main Area Setup
        JPanel mainGUIArea = new JPanel();
        mainGUIArea.setLayout(new GridBagLayout());
        JToolBar contextualToolBar = new JToolBar();
        JTextArea consoleName = new JTextArea("Console:");
        container.add(mainGUIArea);
        //SetVisible
        frame.pack();
        frame.setVisible(true);
    }

    public boolean newShowProcess(){
        //Window Setup
        JFrame newShowPopup = new JFrame("New Show Creator");
        newShowPopup.setBounds(100,100,400,400);
        newShowPopup.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container newShowPopupContainer = newShowPopup.getContentPane();
        //Content Setup
        //JPanel Setup
        JPanel newShowPopupGUIArea = new JPanel();
        newShowPopupGUIArea.setLayout(new GridBagLayout());
        newShowPopup.setLayout(new GridBagLayout());
        newShowPopupContainer.add(newShowPopupGUIArea, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        JTextArea nameTextArea = new JTextArea("Name:");
        JTextArea LORTTextArea = new JTextArea("LORT?");
        JTextArea musicalTextArea = new JTextArea("Musical?");
        JTextArea startDateTextArea = new JTextArea("Start Date:");
        JTextField nameTextField = new JTextField();
        JCheckBox LORTCheckBox = new JCheckBox();
        JCheckBox musicalCheckBox = new JCheckBox();
        String [] monthStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        JComboBox monthSelection = new JComboBox(monthStrings);
        String [] dayStrings = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox daySelection = new JComboBox(dayStrings);
        JTextField yearTextField = new JTextField();
        JPanel nameArea = new JPanel();
        nameArea.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel LORTArea = new JPanel();
        LORTArea.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel musicalArea = new JPanel();
        musicalArea.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel dateArea = new JPanel();
        dateArea.setLayout(new GridBagLayout());


    }

    public boolean saveShowProcess(){
        return false;
    }
}
