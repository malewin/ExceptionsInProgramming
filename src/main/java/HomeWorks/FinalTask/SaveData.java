package HomeWorks.FinalTask;

import HomeWorks.FinalTask.Data.Human;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveData implements SaveHuman {

    @Override
    public void saveHumanTxt(Human human){
        File file = new File(String.format("%s.txt", human.getFirstName()));
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append(human.toString() + "\n");
            fileWriter.flush();
            System.out.println(String.format("-->Данные успешно сохранены в файл \"%s\".", file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
