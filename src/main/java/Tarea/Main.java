package Tarea;

import java.io.*;

public class Main {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBounds,FileNotFoundException {

        Ejercicios excepciones = new Ejercicios();
        Archivo archivo = new Archivo();

        archivo.setName("Ejemplo.txt");
        archivo.setContenido("Este es el contenido we");

        int ejercicio1 = excepciones.divideEntreCero(5, 1);
        System.out.println(ejercicio1);

        boolean ejercicio2 = excepciones.obtenerNumeros(5);
        System.out.println(ejercicio2);



        try {
            // Crear un objeto File para representar el archivo
            File archivox = new File(archivo.getNombre());

            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(archivox);

            // Crear un objeto BufferedWriter para escribir de manera más eficiente
            BufferedWriter bufferEscritor = new BufferedWriter(escritor);

            // Escribir el contenido en el archivo
            bufferEscritor.write(archivo.getContenido());

            // Cerrar el BufferedWriter
//            bufferEscritor.close();
//
//            System.out.println("El archivo se creó exitosamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }

        String contenidoFichero = archivo.accediendoFichero("Ejemplo.txt");
        System.out.println(contenidoFichero);

    }
}