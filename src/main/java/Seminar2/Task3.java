package Seminar2;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
    //для проверки, заменить какое-то из значений на null
    private static File file = new File("Task3.txt");

    public static void writeToFile(List<String> strings){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            for (String item: strings){
                fileWriter.append(item+"\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Map<String, Integer> readFromFile(){
        Map<String, Integer> resultMap = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line= bufferedReader.readLine())!=null){
                String[] splitLine = line.split("=");
                String key = splitLine[0];
                int value = splitLine[1].equals("?") ? key.length() : Integer.parseInt(splitLine[1]);
                resultMap.put(key, value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Неверный формат данных");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultMap;
    }


    public static void reWriteFile(){
        Map<String, Integer> inputMap = readFromFile();
        List<String> forWrite = new LinkedList<>();
        for (Map.Entry<String, Integer> entry: inputMap.entrySet()){
            forWrite.add(entry.toString());
        }
        writeToFile(forWrite);
    }

    public static void main(String[] args) {

        writeToFile(strings);
        System.out.println(readFromFile());
        reWriteFile();
    }
}
