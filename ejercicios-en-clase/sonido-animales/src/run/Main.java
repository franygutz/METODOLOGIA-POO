package run;

import models.Gato;
import models.Perro;

public class Main {
    public static void main(String[] args) {
        Gato gatito = new Gato("Sienna", 3);
        Perro perrito = new Perro("Sienno", 4);

        System.out.println(gatito.hacerSonido());
        System.out.println(perrito.hacerSonido());
    }
}
