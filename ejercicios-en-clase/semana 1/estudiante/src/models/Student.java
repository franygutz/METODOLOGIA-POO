package models;

public class Student {
    // atributos
    private String firstname;
    private String lastname;
    private String major;
    private float avarage;

    // Metodo 1 - constructor
    public Student() {
    }

    public Student(float avarage, String major, String lastname, String firstname) {
        this.avarage = avarage;
        this.major = major;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    //getter y setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getAvarage() {
        return avarage;
    }

    public void setAvarage(float avarage) {
        this.avarage = avarage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", major='" + major + '\'' +
                ", avarage=" + avarage +
                '}';
    }
}
