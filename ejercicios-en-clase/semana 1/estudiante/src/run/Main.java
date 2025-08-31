package run;

import models.Student;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sesion 2, Miercoles, 27 de Agosto");

        //Variables primitivas
        int numero = 0;
        int Numero = 1;
        int numer0 = 3;
        System.out.println(""+numero);
        System.out.println(""+Numero);
        System.out.println(""+numer0);

        float salario = 25000.00f;
        System.out.println(""+salario);

        double promedio = salario*0.5;
        System.out.println(""+promedio);

        String carrera = "Ingenieria en Sistema de Informacion";
        System.out.printf("%s", carrera);

        Student student = new Student(99, "Ingenieria Civil", "Lacayo", "Andre");

        JOptionPane.showMessageDialog(null, student);
    }
}
