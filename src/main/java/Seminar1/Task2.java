package Seminar1;

/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3*/

public class Task2 {
    public static void main(String[] args) {

        System.out.println(findElementInArray(new int[]{0,2,5,8,9,10},2,2));

    }

    public static int findElementInArray(int[] array, int element, int minLength){
        if (array==null)
            return -3;
        if (array.length<minLength)
            return -1;
        for (int i=0; i<array.length; i++){
            if (array[i]==element)
                return i;
        }
        return -2;
    }
}
