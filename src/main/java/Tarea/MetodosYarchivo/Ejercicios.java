package Tarea.MetodosYarchivo;

import Tarea.Excepciones.ArithmeticException;
import Tarea.Excepciones.ArrayIndexOutOfBounds;

public class Ejercicios {

    public int resultado;


    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int divideEntreCero(int dividendo, int divisor)throws ArithmeticException {

        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        } catch (Exception e){
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        return resultado;
    }

    public boolean obtenerNumeros (int numberInArray) throws ArrayIndexOutOfBounds {


        int[] array = {1,2,3,4,5,6};

        if (numberInArray <= array.length) {
            return true;
        } else {
            throw new ArrayIndexOutOfBounds(numberInArray + " no esta en el array");
        }
    }
}
