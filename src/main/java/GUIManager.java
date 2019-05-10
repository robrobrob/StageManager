import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

public class GUIManager implements hasConsoleAccess {
    Console console;
    JFrame frame;

    public GUIManager(Console console){
        this.console = console;
        //Window Setup
        frame = new JFrame("Stage Manager");
        frame.setBounds(100,100,1000,1000);
        frame.setMinimumSize(new Dimension(1000,800));
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
                boolean successfulComplete = newShowProcess();
                if(successfulComplete) {
                    console.addMessage("Successfully created new show");
                }
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
        //JToolBar Setup
        JToolBar contextualToolBar = new JToolBar();
        contextualToolBar.setFloatable(false);
        contextualToolBar.setPreferredSize(new Dimension(1000,30));
        mainGUIArea.add(contextualToolBar,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
        //Work Area Setup
        JPanel workspace = new JPanel();
        workspace.setPreferredSize(new Dimension(1000,750));
        mainGUIArea.add(workspace, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        //Console Setup
        JPanel consoleArea = new JPanel();
        consoleArea.setLayout(new GridBagLayout());
        JTextArea consoleName = new JTextArea("Console:");
        consoleName.setPreferredSize(new Dimension(50, 20));
        JTextArea consoleTextArea = new JTextArea();
        consoleTextArea.setPreferredSize(new Dimension(950,20));
        consoleArea.add(consoleName, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
        consoleArea.add(consoleTextArea, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
        mainGUIArea.add(consoleArea, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.PAGE_START,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
        container.add(mainGUIArea);
        //SetVisible
        frame.pack();
        frame.setVisible(true);
    }

    public boolean newShowProcess(){
        //Window Setup
        JFrame newShowPopup = new JFrame("New Show Creator");
        newShowPopup.setBounds(100,100,400,400);
        newShowPopup.setMinimumSize(new Dimension(250,300));
        newShowPopup.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container newShowPopupContainer = newShowPopup.getContentPane();
        //Content Setup
        //JPanel Setup
        JPanel newShowPopupGUIArea = new JPanel();
        newShowPopupGUIArea.setLayout(new GridBagLayout());
        newShowPopupContainer.setLayout(new BoxLayout(newShowPopupContainer,BoxLayout.Y_AXIS));
        newShowPopupContainer.add(newShowPopupGUIArea);
        //newShowPopupGUIArea.setBackground(Color.blue);
        //JItems and Setup
        Dimension textAreaDimensions = new Dimension(60,20);
        int defaultWidth = 50;
        int defaultHeight = 20;
        //nameTextArea
        JTextArea nameTextArea = new JTextArea("Name:");
        nameTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        nameTextArea.setFocusable(false);
        nameTextArea.setEditable(false);
        nameTextArea.setMinimumSize(textAreaDimensions);
        nameTextArea.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        nameTextArea.setOpaque(false);
        //LORTTextArea
        JTextArea LORTTextArea = new JTextArea("LORT?");
        LORTTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        LORTTextArea.setFocusable(false);
        LORTTextArea.setEditable(false);
        LORTTextArea.setMinimumSize(textAreaDimensions);
        LORTTextArea.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        LORTTextArea.setOpaque(false);
        //musicalTextArea
        JTextArea musicalTextArea = new JTextArea("Musical?");
        musicalTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        musicalTextArea.setFocusable(false);
        musicalTextArea.setEditable(false);
        musicalTextArea.setMinimumSize(textAreaDimensions);
        musicalTextArea.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        musicalTextArea.setOpaque(false);
        //startDateTextArea
        JTextArea startDateTextArea = new JTextArea("Start Date:");
        startDateTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        startDateTextArea.setFocusable(false);
        startDateTextArea.setEditable(false);
        startDateTextArea.setMinimumSize(textAreaDimensions);
        startDateTextArea.setPreferredSize(new Dimension(60,defaultHeight));
        startDateTextArea.setOpaque(false);
        //nameTextField
        JTextField nameTextField = new JTextField();
        nameTextField.setPreferredSize(new Dimension(200,defaultHeight));
        //LORTCheckBox
        JCheckBox LORTCheckBox = new JCheckBox();
        LORTCheckBox.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        //musicalCheckBox
        JCheckBox musicalCheckBox = new JCheckBox();
        musicalCheckBox.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        //monthSelection
        String [] monthStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        JComboBox monthSelection = new JComboBox(monthStrings);
        //daySelection
        String [] dayStrings = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox daySelection = new JComboBox(dayStrings);
        //yearTextField
        JFormattedTextField yearTextField = new JFormattedTextField();
        yearTextField.setMinimumSize(textAreaDimensions);
        yearTextField.setPreferredSize(new Dimension(defaultWidth,defaultHeight));
        MaskFormatter yearFormat = new MaskFormatter();
        try{
            yearFormat.setMask("####");
            console.addMessage("YearTextField successfully set mask");
        } catch (ParseException e) {
            console.addMessage(e.getMessage() + "FAILURE TO CREATE NEW SHOW DUE TO INVALID MASK");
            return false;
        }
        //todayButton
        JButton todayButton = new JButton("Today");
        todayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GregorianCalendar now = new GregorianCalendar();
                int nowInt = now.get(Calendar.MONTH);
                monthSelection.setSelectedIndex(nowInt + 1);
            }
        });
        //createNewShowButton
        JButton createNewShowButton = new JButton("Create Show");
        //JPanels and Setup
        JPanel columnArea = new JPanel();
        columnArea.setLayout(new GridBagLayout());
        JPanel column1 = new JPanel();
        column1.setLayout(new GridBagLayout());
        //column1.setBackground(Color.green);
        JPanel column2 = new JPanel();
        column2.setLayout(new GridBagLayout());
        //column2.setBackground(Color.cyan);
        JPanel dateArea = new JPanel();
        //dateArea.setBackground(Color.pink);
        dateArea.setLayout(new GridBagLayout());
        JPanel createButtonArea = new JPanel();
        //createButtonArea.setBackground(Color.orange);
        createButtonArea.setLayout(new GridBagLayout());
        //Adding JItems to JPanels
        Insets defaultInsets = new Insets(10,10,10,10);
        Insets column1Insets = new Insets(10,10,10,0);
        Insets column2Insets = new Insets(10,0,10,10);
        Insets noInsets = new Insets(0,0,0,0);
        column1.add(nameTextArea, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        column2.add(nameTextField, new GridBagConstraints(0,0,2,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        column1.add(LORTTextArea, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        column2.add(LORTCheckBox, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        column1.add(musicalTextArea, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        column2.add(musicalCheckBox, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,column2Insets,0,0));
        columnArea.add(column1, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        columnArea.add(column2, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        dateArea.add(startDateTextArea, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        dateArea.add(monthSelection, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        dateArea.add(daySelection, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        dateArea.add(yearTextField, new GridBagConstraints(2,1,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,defaultInsets,0,0));
        dateArea.add(todayButton, new GridBagConstraints(0,2,3,1,0,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH,defaultInsets,0,0));
        createButtonArea.add(createNewShowButton, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.NONE,defaultInsets,0,0));
        //Adding JPanels to main GUI Area
        newShowPopupGUIArea.add(columnArea, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,new Insets(0,0,0,0),0,0));
        newShowPopupGUIArea.add(dateArea, new GridBagConstraints(0,1,2,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,new Insets(0,0,0,0),0,0));
        newShowPopupGUIArea.add(createButtonArea, new GridBagConstraints(0,2,2,1,0,0,GridBagConstraints.LINE_START,GridBagConstraints.FIRST_LINE_START,new Insets(0,0,0,0),0,0));
        newShowPopup.pack();
        newShowPopup.setVisible(true);
        System.out.println("NameTextArea: " + nameTextArea.getSize());
        System.out.println("LORTTextArea: " + LORTTextArea.getSize());
        System.out.println("MusicalTextArea: " + musicalTextArea.getSize());
        System.out.println("StartDateTextArea: " + startDateTextArea.getSize());
        System.out.println("NameTextField: " + nameTextField.getSize());
        System.out.println("LORTCheckBox: " + LORTCheckBox.getSize());
        System.out.println("MusicalCheckBox: " + musicalCheckBox.getSize());
        System.out.println("ColumnArea: " + columnArea.getSize());
        return true;
    }

    public boolean saveShowProcess(){
        return false;
    }

    @Override
    public Console getConsole() {
        return console;
    }

    public Frame getFrame(){
        return frame;
    }
}
