package run;

public class Ejercicio1 {
    public static void main(String[] args) {
        //objeto de la clase Persona
        Persona persona = new Persona();

        //asignar valores a los atributos
        persona.nombre = "Franya Gutierrez";
        persona.edad = 18;

        //mostrar datos de la persona
        System.out.println(persona.mostrarDatos());
    }
}
