package dao;

import models.Estudiante;

import java.util.ArrayList;

public class EstudianteDAO {

    private ArrayList<Estudiante> listado;

    public EstudianteDAO(){
        this.listado = new ArrayList<>();
    }

    //agregar
    public void agregarEstudiante(Estudiante estudiante){
        listado.add(estudiante);
    }

    //eliminar
    public void eliminarEstudiante(Estudiante estudiante){
        listado.remove(estudiante);
    }

    //buscar
    public Estudiante buscarEstudiantes(String nombre)
    {
        for (Estudiante estudiante : listado){
            if (estudiante.getNombre().equals(nombre)){
                return estudiante;
            }
        }
        return null;
    }

    //modificar
    public void editarEstudiante(Estudiante estudiante){
        for (Estudiante est: listado){
            if (est.getNombre().equals(estudiante.getNombre())){
                est.setNombre(estudiante.getNombre());
            }
        }
    }

    //Listar
    public ArrayList<Estudiante> mostrar(){
        return this.listado;
    }
}
