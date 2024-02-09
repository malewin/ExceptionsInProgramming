package HomeWorks.Seminar1;


/*Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример


a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};

Вывод: [3, 3, 3]

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3, 5};

Вывод: [0]*/

import java.util.Arrays;

public class Task2 {
    public static int[] subArrays(int[] a, int[] b){
        int[] c;
        if (a.length!=b.length)
            c = new int[1];
        else {
            c = new int[a.length];
            for (int i = 0; i < a.length; i++)
                c[i]=a[i]-b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrays(new int[]{0,1,5,6,7}, new int[]{3,4,2,6})));
    }

}
