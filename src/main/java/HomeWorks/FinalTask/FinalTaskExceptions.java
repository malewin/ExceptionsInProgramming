package HomeWorks.FinalTask;

import HomeWorks.FinalTask.Data.CheckHumanData;
import HomeWorks.FinalTask.Data.Human;
import HomeWorks.FinalTask.Data.ParseHumanData;
import HomeWorks.FinalTask.MyExceptios.InputDataException;


public class FinalTaskExceptions {

    public static void printDescription(){
        System.out.println("Введите следующие параметры для сохранения в системе, разделяя их одним пробелом:");
        System.out.println("Фамилия Имя Отчество датаРождения номерТелефона пол");
        System.out.println("(Для написания ФИО используйте кириллицу)");
        System.out.println();
        System.out.println("Например: ");
        System.out.println("Карпов Алексей Игоревич 04.05.1985 100567 m");
        System.out.println("Сергеева Елена Андреевна 23.12.2000 79032550850 f");
        System.out.print("-->");
    }

    public static void main(String[] args) {
        ParseHumanData parseData = new ParseHumanData(new CheckHumanData());
        SaveHuman saveData = new SaveData();
        InputFromConsole getData = new GetFromConsole();

        printDescription();
        String inputData = getData.prompt();
        try {
            Human human = parseData.getParsedHumanData(inputData);
            saveData.saveHumanTxt(human);
        } catch (InputDataException e) {
            e.printStackTrace();
        }

    }
}
