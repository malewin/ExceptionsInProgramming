package HomeWorks.LastTask.Data;

import java.util.Collections;

import HomeWorks.LastTask.Exceptions.InputDataException;

public class ParseHumanData {
    protected CheckHumanData checkData;
    public Human readyHuman;

    public ParseHumanData( CheckHumanData checkData){
        this.checkData = checkData;
    }

    public Human getParseHumanData(String data) throws InputDataException {
        parseHumanData(data);
        return readyHuman;
    }
    
    public void parseHumanData(String data) throws NumberFormatException, InputDataException{

        String [] splitedArray = data.split(" ");

        checkData.setSplitedArray(splitedArray);

        if(checkData.isValidData()) {
            Human currentHuman = new Human();

            currentHuman.firstName = splitedArray[0];
            currentHuman.secondName = splitedArray[1];
            currentHuman.lastName = splitedArray[2];
            currentHuman.bitrhday = splitedArray[3];
            currentHuman.phonenumber = splitedArray[4];
            currentHuman.gender = splitedArray[5];

            readyHuman = currentHuman;
            System.out.println("---> Вводимые данные обработаны");
        }



}
}
