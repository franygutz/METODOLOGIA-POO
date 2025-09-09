package run;

import dao.EstudianteDAO;
import models.Estudiante;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*int[] edades = new int[3];

        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 15;

        System.out.println("---- OPCION 1 ----");
        for(int i = 0; i < edades.length; i++){
            System.out.print(edades[i]);
            if(edades[i] >= 18){
                System.out.println(": Mayor de edad");
            }
            else if(edades[i] < 18){
                System.out.println(": Menor de edad");
            }
        }
        System.out.println("--------------------");

        System.out.println();
        System.out.println("---- OPCION 2 ----");
        for(int edad : edades){
            String msn = edad +", "+ (edad >= 18 ? "Mayor de edad": "Menor de edad");
            System.out.println(msn  );
        }
        System.out.println("--------------------");

        System.out.println();
        System.out.println("----- OPCION 3 -----");

        Estudiante[] listado = new Estudiante[3];
        listado[0] = new Estudiante("Harry", 20);
        listado[1] = new Estudiante("Andre", 40);
        listado[2] = new Estudiante("Sofia", 10);

        for (Estudiante est : listado) {
            System.out.println(est);
        }*/

        //DAO
        EstudianteDAO dao = new EstudianteDAO();
        dao.agregarEstudiante(new Estudiante("Daya", 18));

        for (Estudiante est : dao.mostrar()){
            System.out.println(est);
        }
    }
}

