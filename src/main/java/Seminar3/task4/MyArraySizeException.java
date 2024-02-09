package Seminar3.task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Массив не верной длинны");
    }
}