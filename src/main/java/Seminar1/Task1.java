package Seminar1;

/*Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.*/


public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,6,8};
        System.out.println(checkArrayLength(arr, 2));

    }

    public static int checkArrayLength(int[] array, int minLength){
        if (array.length<minLength)
            return -1;
        return array.length;
    }
}
