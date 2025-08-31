package models;

public class Estudiante {
    //atributos: nombre, matricula, promedio
    private String nombre;
    private String matricula;
    private double promedio;

    //constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    //metodos
    public boolean estudianteAprobado(){
        return promedio>=70;
    }

    public void informacionEstudiante(){
        System.out.println("DATOS DE ESTUDIANTE\nNombre: " + nombre + "\nMatricula: " + matricula + "\nPromedio: "+ promedio);
        System.out.println(estudianteAprobado() ? "Aprobado" : "Desaprobado");
    }
}
