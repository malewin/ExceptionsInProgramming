package HomeWorks.Seminar1;

/*Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.

Если длины массивов не равны - верните нулевой массив длины 1.

Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример


a = new int[]{12, 8, 16};
b = new int[]{4, 2, 4};

Вывод: [3, 4, 4]

a = new int[]{12, 8, 16, 25};
b = new int[]{4, 2, 4};

Вывод: [0]*/


import java.util.Arrays;

public class Task3 {

    public static int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c;
        if (a.length!=b.length)
            c = new int[]{0};
        else {
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                try {
                    c[i] = a[i] / b[i];
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(String.format("Деление на ноль, индекс массива: %d",i));
                    break;
                }

            }
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divArrays(new int[]{1,4,5,9},new int[]{3,2,0,3})));
    }

}
