package Tarea;

public class ArithmeticException extends Exception{

    public ArithmeticException (String message) {
        super("Error de tipo aritmético -> " + message);
    }
}
