package Tarea.MetodosYarchivo;

import Tarea.Excepciones.FileNotFoundException;

import java.util.Objects;

public class Archivo {

    private String nombreArchivo;
    private String contenido;

    public void setName (String valor){
         this.nombreArchivo = valor;
    }
    public String getNombre(){
        return nombreArchivo;
    }
    public void setContenido(String valor){
        this.contenido = valor;
    }
    public String getContenido(){
        return contenido;
    }

    public String accediendoFichero (String nombre) throws FileNotFoundException {
        if (Objects.equals(nombreArchivo, nombre)){
            return contenido;
        } else {
            throw new FileNotFoundException("No se ha encontrado el archivo");
        }
    }
}
