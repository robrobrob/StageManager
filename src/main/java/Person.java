import java.util.ArrayList;

public class Person {
    String lastName;
    String firstName;
    int phoneNumber;
    boolean displayPhoneNumber;
    String email;
    boolean displayEmail;
    ContactPreference contactPreference;
    String notes;
    String jobTitle;
    JobType jobType;
    ArrayList<Job> job;
    Department department;

    public Person() {

    }

    public Person(String lastName, String firstName, JobType jobType, ArrayList<Job> job) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobType = jobType;
        this.job = job;
    }

    //Getters

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isDisplayEmail() {
        return displayEmail;
    }

    public ContactPreference getContactPreference() {
        return contactPreference;
    }

    public String getNotes() {
        return notes;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public JobType getJobType() {
        return jobType;
    }

    public ArrayList<Job> getJob() {
        return job;
    }

    public Department getDepartment() {
        return department;
    }

    //Setters

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDisplayPhoneNumber(boolean displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDisplayEmail(boolean displayEmail) {
        this.displayEmail = displayEmail;
    }

    public void setContactPreference(ContactPreference contactPreference) {
        this.contactPreference = contactPreference;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public void setJob(ArrayList<Job> job) {
        this.job = job;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
