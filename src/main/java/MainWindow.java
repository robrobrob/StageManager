import javax.swing.*;

public class MainWindow {
    private JTabbedPane tabbedPane;
    private JLabel Console;
    private JPanel script;
    private JPanel runSheet;
    private JPanel dailyCall;
    private JPanel rehearsalReport;
    private JPanel rehearsalLog;
    private JPanel mainPanel;
    private JToolBar scriptToolBar;
    private JPanel scriptPlacePanel;
    private JToolBar runSheetToolBar;
    private JPanel runSheetPlacePanel;
    private JToolBar dailyCallToolBar;
    private JPanel dailyCallPlacePanel;
    private JToolBar rehearsalReportToolBar;
    private JPanel rehearsalReportPlacePanel;
    private JToolBar rehearsalLogToolBar;
    private JPanel rehearsalLogPlacePanel;
    private JPanel consoleArea;
    private JPanel tabbedPanePanel;

    public MainWindow(){

    }

    //Getters

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public JLabel getConsole() {
        return Console;
    }

    public JPanel getScript() {
        return script;
    }

    public JPanel getRunSheet() {
        return runSheet;
    }

    public JPanel getDailyCall() {
        return dailyCall;
    }

    public JPanel getRehearsalReport() {
        return rehearsalReport;
    }

    public JPanel getRehearsalLog() {
        return rehearsalLog;
    }

    public JToolBar getScriptToolBar() {
        return scriptToolBar;
    }

    public JPanel getScriptPlacePanel() {
        return scriptPlacePanel;
    }

    public JToolBar getRunSheetToolBar() {
        return runSheetToolBar;
    }

    public JPanel getRunSheetPlacePanel() {
        return runSheetPlacePanel;
    }

    public JToolBar getDailyCallToolBar() {
        return dailyCallToolBar;
    }

    public JPanel getDailyCallPlacePanel() {
        return dailyCallPlacePanel;
    }

    public JToolBar getRehearsalReportToolBar() {
        return rehearsalReportToolBar;
    }

    public JPanel getRehearsalReportPlacePanel() {
        return rehearsalReportPlacePanel;
    }

    public JToolBar getRehearsalLogToolBar() {
        return rehearsalLogToolBar;
    }

    public JPanel getRehearsalLogPlacePanel() {
        return rehearsalLogPlacePanel;
    }

    //Tab enabling and checking

    public void setScriptTabEnabled(boolean enabled){
        script.setEnabled(enabled);
    }

    public void setRunSheetTabEnabled(boolean enabled){
        runSheet.setEnabled(enabled);
    }

    public void setDailyCallTabEnabled(boolean enabled){
        dailyCall.setEnabled(enabled);
    }

    public void setRehearsalReportTabEnabled(boolean enabled){
        rehearsalReport.setEnabled(enabled);
    }

    public void setRehearsalLogTabEnabled(boolean enabled){
        rehearsalLog.setEnabled(enabled);
    }

    public boolean getScriptTabEnabled(){
        return script.isEnabled();
    }

    public boolean getRunSheetTabEnabled(){
        return runSheet.isEnabled();
    }

    public boolean getDailyCallTabEnabled(){
        return dailyCall.isEnabled();
    }

    public boolean getRehearsalReportTabEnabled(){
        return rehearsalReport.isEnabled();
    }

    public boolean getRehearsalLogTabEnabled(){
        return rehearsalLog.isEnabled();
    }

}
