package HomeWorks.Seminar2;

/*Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
Если преобразование не удалось, программа выдаёт сообщение об ошибке
Your input is not a float number. Please, try again.
и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.

На входе:


'3.14'
'Ivan'
На выходе:


3.14*/

public class Task1 {

    public static float isFloat(String input) {
// Введите свое решение ниже
        try{
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }

    }

    public static void main(String[] args) {
        System.out.println(isFloat("text"));
    }
}
