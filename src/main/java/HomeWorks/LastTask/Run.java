package HomeWorks.LastTask;

import java.util.Scanner;

import HomeWorks.LastTask.Data.CheckHumanData;
import HomeWorks.LastTask.Data.ParseHumanData;
import HomeWorks.LastTask.Exceptions.InputDataException;
import HomeWorks.LastTask.Data.Human;

public class Run {

    public static void printDescription(){
        System.out.println("Введите следующие параметры для сохранения в системе, разделяя их одним пробелом:");
        System.out.println("Фамилия Имя Отчество датаРождения номерТелефона пол");
        System.out.println("(Для написания ФИО используйте кириллицу)");
        System.out.println();
        System.out.println("Например: ");
        System.out.println("Можечкова Светлана Эдуардовна 02.10.1999 89990009900 f");
        System.out.println("Сизых Вячеслав Александрович 25.01.2015 89137734565 m");
        System.out.print("-->");
    }

    public static void main(String[] args) {
        boolean switchStatus = true;
        ParseHumanData parseHumanData = new ParseHumanData(new CheckHumanData());
        SaveHuman saveData = new SaveData();
        InpFrConsole getData = new GetFromConsole();


        while (switchStatus) {

            System.out.println("Введите режим: Запись - 1, Выход -2.");
            Scanner menu = new Scanner(System.in);
            String choice = menu.nextLine();
            

            switch (choice) {
                case "1":
                    printDescription();
                    String inputData = getData.prompt();
                    try {
                        Human human = parseHumanData.getParseHumanData(inputData);
                        saveData.saveHumanToTxt(human);
                    } catch (InputDataException e) {
                        e.printStackTrace();
                    }
                    break;

                case "2":
                    switchStatus = false;
                    break;
                default:
                    break;
            }
    }
    }
}
