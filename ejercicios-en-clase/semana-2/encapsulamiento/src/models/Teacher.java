package models;

public class Teacher {
    private String name;
    private Degree degree;

    //
    public Teacher (String name, String nameDegree){
        this.name = name;
        this.degree = new Degree(name);
    }
}
