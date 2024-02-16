package HomeWorks.LastTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import HomeWorks.LastTask.Data.CheckHumanData;
import HomeWorks.LastTask.Data.Human;
import HomeWorks.LastTask.Data.ParseHumanData;
import HomeWorks.LastTask.Data.CheckData;

public class SaveData implements SaveHuman{

    @Override
    public void saveHumanToTxt(Human human) {
        File humanTitle = new File(String.format("%s.txt", human.getFirstName()));
        try (FileWriter filewriter = new FileWriter(humanTitle, true)){
            filewriter.append(human.toString() + "\n");
            filewriter.flush();
            System.out.println(String.format("Данные о человеке успешны сохранены в файл \"%s\".", humanTitle));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
