package run;

import models.Coche;

public class Ejercicio2 {
    public static void main(String[] args){
        //objeto de la clase coche
        Coche coche = new Coche();

        //valores de coche
        coche.marca = "Hyundai";
        coche.modelo= "Accent";
        coche.ano = 2014;

        //mostrar datos
        System.out.println(coche.mostrarInfo());
    }
}
