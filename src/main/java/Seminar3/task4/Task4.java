package Seminar3.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * <p>
 * 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 * с детализацией, в какой именно ячейке лежат неверные данные.
 * <p>
 * 2. В методе main() вызвать полученный метод, обработать возможные исключения
 * MyArraySizeException и MyArrayDataException и вывести результат расчета
 * (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][]{
            {"1", "1.5", "1.5"},
            {"1", "i1.5", "1.5"},
            {"1w", "1.5", "a1.5"}
    };

    public static void main(String[] args) {
        System.out.println(sum2d(arr));

    }

    public static double sum2d(String[][] arr) {
        List<Point2D> lst = new ArrayList<>();
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) throw new MyArraySizeException();
            for (int j = 0; j < arr.length; j++) {
                try {
                sum += Double.parseDouble(arr[i][j]);
                }
                catch (NumberFormatException e){
                    lst.add(new Point2D(i,j));
                }
            }
        }
        if (!lst.isEmpty())throw new MyArrayDataException(lst);
        return sum;
    }
}