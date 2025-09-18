package models;

public class Gato extends Animal{
    private String sonido;

    public Gato(String nombre, int edad){
        super(nombre, edad);
        this.sonido = "meow";
    }

    @Override
    public String hacerSonido(){
        return super.hacerSonido() + "Yo hago " + sonido + " " + sonido;
    }
}
