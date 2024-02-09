package HomeWorks.Seminar2;

/*Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
"Пустая строка введена.".
В противном случае программа должна возвращать сообщение
"Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.

На входе:


'0'
На выходе:


Result: Your input was - 0*/

public class Task4 {

    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if (a==' ')
            throw new RuntimeException();
        else
            return String.format("Your input was - %c", a);
    }

    public static void main(String[] args) {
        char a = 'h';
        try {
            String result = expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
//            System.err.println("Error: " + e.getMessage());
        }

    }

}
