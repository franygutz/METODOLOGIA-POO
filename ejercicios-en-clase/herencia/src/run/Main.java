package run;

import models.Student;

public class Main {
    public static void main(String[] args) {
        Student student0 = new Student("Dominick Navarro", 18, "Ingeneria en Sistemas");
        Student student1 = new Student("Franya Gutierrez", 18, "Ingeneria en Sistemas");
        System.out.println(student0.introduceYourself());
        System.out.println(student1.introduceYourself());
    }
}
