package HomeWorks.Seminar2;

/*Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.

На входе:


'1 2 3 4 5 6 7 8 9'
'1'
На выходе:


intArray[8] / d = 9 / 1 = 9.0
9.0
После запуска программы, если не переданы аргументы командной строки, то intArray будет {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} и d будет равно 0. В этом случае результат выражения intArray[8] / d будет бесконечность (так как деление на 0).

Таким образом, программа выведет сообщение:

It's not possible to evaluate the expression - intArray[8] / d as d = 0.
NaN
В случае, если аргументы командной строки переданы, программа преобразует их в массив intArray и d соответственно. Затем вызывается метод expr, и результат выводится на экран, например:

intArray[8] / d = 8 / 3 = 2.6666666666666665
2.6666666666666665
Программа должна выдавать следующие ошибки:

Если длина массива меньше 9:
It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.

В этом случае, если массив имеет меньше 9 элементов, программа сообщает, что не удается вычислить выражение, так как в массиве нет 8-го элемента.

Если d равно 0:
It's not possible to evaluate the expression - intArray[8] / d as d = 0.

Если d равно 0, программа сообщает, что не удается вычислить выражение, так как деление на 0 невозможно.

Если условия не выполняются и программа успешно вычисляет результат, то выводится сообщение:
intArray[8] / d = {значение} / {значение} = {результат}

Где {значение} заменяется на соответствующие значения.

Примеры входных данных и соответствующих сообщений об ошибках:

Входные аргументы: 1 2 3 It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.

Входные аргументы: 1 2 3 4 5 6 7 8 9 0
It's not possible to evaluate the expression - intArray[8] / d as d = 0.

Входные аргументы: 1 2 3 4 5 6 7 8 9 10
intArray[8] / d = 9 / 10 = 0.9

*/

public class Task2 {

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        double result = Double.NaN;
        try{
            if (d==0){
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            }
            else {
                result = (double) intArray[8] / d;
                System.out.println(String.format("intArray[8] / d = %d / %d = %.1f", intArray[8], d, result));
            }
        } catch (IndexOutOfBoundsException e) {
        System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
        }finally {
            return result;
        }
    }

    public static void main(String[] args) {

        double result = expr(new int[]{1,2,3,4,5,7,8,9},1);
        System.out.println(result);

    }

}
