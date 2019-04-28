public class Note {
    Department department;
    String text;

    public Note() {

    }

    public Note(Department type, String text) {
        this.department = type;
        this.text = text;
    }

    //Getters

    public Department getDepartment() {
        return department;
    }

    public String getText() {
        return text;
    }

    //Setters

    public void setDepartment(Department type) {
        this.department = type;
    }

    public void setText(String text) {
        this.text = text;
    }
}
