package HomeWorks.FinalTask.Data;


import HomeWorks.FinalTask.MyExceptios.InputDataException;

public class ParseHumanData {

    protected CheckHumanData checkData;
    protected Human resultHuman;

    public ParseHumanData(CheckHumanData checkData) {
        this.checkData = checkData;
    }

    public Human getParsedHumanData(String data) throws InputDataException {
        parseHumanData(data);
        return resultHuman;
    }

    private void parseHumanData(String data) throws InputDataException {

        String[] splitData = data.split(" ");

        checkData.setSplitData(splitData);

        if(checkData.isValidData()) {

            Human currentHuman = new Human();
            currentHuman.firstName = splitData[0];
            currentHuman.secondName = splitData[1];
            currentHuman.lastName = splitData[2];
            currentHuman.birthDate = splitData[3];
            currentHuman.phoneNumber = splitData[4];
            currentHuman.gender = splitData[5];

            resultHuman = currentHuman;
            System.out.println("-->Входные данные успешно обработаны");
        }
    }


}
