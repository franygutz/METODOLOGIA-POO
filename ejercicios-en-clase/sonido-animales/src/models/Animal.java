package models;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Introducir los sonidos de los animales
     * @return un string con el sonido del animal
     */

    public String hacerSonido(){
        return "Hola, soy " + nombre + ". Tengo "  + edad + " años. ";
    }


}
