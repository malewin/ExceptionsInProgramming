package Seminar1;

/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
метод должен бросить RuntimeException с сообщением об ошибке.*/

public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 2},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        System.out.println(countElementsSum(ints));

    }

    public static int countElementsSum(int[][] array){
        int sum=0;
        for (int i=0; i<array.length; i++) {
            if (array[i].length != array.length)
                throw new RuntimeException("Массив неквадратный;");
            for (int j = 0; j < array[i].length; j++) {
                int elem = array[i][j];
                if (elem == 0 || elem == 1)
                    sum += elem;
                else
                    throw new RuntimeException("В массиве есть числа отличные от 0 и 1;");
            }
        }
        return sum;
    }
}
