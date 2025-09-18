package models;

public class Perro extends Animal{
    private String sonido;

    public Perro(String nombre, int age)
    {
        super(nombre, age);
        this.sonido = "woof";
    }

    @Override
    public String hacerSonido() {
        return super.hacerSonido() + "Yo hago "+ sonido +" "+ sonido;
    }
}
