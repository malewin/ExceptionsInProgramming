package Seminar3.task3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Задание 3.2
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class NonExistedFileException extends Exception {
    public NonExistedFileException(String s) {
        super(s);
    }
}