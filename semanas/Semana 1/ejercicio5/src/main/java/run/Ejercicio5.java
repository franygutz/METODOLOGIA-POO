package run;

import models.Estudiante;

public class Ejercicio5 {
    public static void main(String[] args) {
        //objeto de tipo Estudiante
        Estudiante estudiante1 = new Estudiante("Franya", "23021809",65);
        estudiante1.informacionEstudiante();

        Estudiante estudiante2 = new Estudiante("Luis", "23021185",95);
        estudiante2.informacionEstudiante();
    }
}
