package HomeWorks.LastTask.Data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import HomeWorks.LastTask.Exceptions.InputErrorTypeEnum;
import HomeWorks.LastTask.Exceptions.InputDataException;
import HomeWorks.LastTask.Exceptions.InputErrorTypeEnum;

public class CheckHumanData extends CheckData{

    public CheckHumanData(){
        phraseLength = 6;
    }

    @Override
    public boolean isValidData() throws InputDataException {
        checkInputDataLength();
        checkFIO();
        checkDate();
        checkPhoneNumber();
        checkGender();
        return true;
    }

    public void checkInputDataLength() throws InputDataException{
        int checkLength = splitedArray.length;
        if (checkLength != phraseLength){
            if ( checkLength < phraseLength)
            throw new InputDataException(String.format("Введенных слов меньше необходимого (<%s>)", phraseLength), InputErrorTypeEnum.DataLengthError);
            else
            throw new InputDataException(String.format("Введенных слов больше необходимого (<%s>)", phraseLength), InputErrorTypeEnum.DataLengthError);
        
    }
    }

    private void checkFIO() throws InputDataException{
        for (int i=0; i<3; i++) {
            if (!checkNameFormat(splitedArray[i]))
                throw new InputDataException(String.format("Ошибка: неверный формат при вводе ФИО - '%s'", splitedArray[i]), InputErrorTypeEnum.NameError);
            }
        }

    private boolean checkNameFormat(String name){
        Pattern pattern = Pattern.compile("^[а-яА-Я-]{1,20}$");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

        private void checkDate() throws InputDataException{
        String inputDate = splitedArray[3];
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        if (!checkDateFormat(inputDate))
            throw new InputDataException("Ошибка: неверный формат даты", InputErrorTypeEnum.DateError);
        try {
            dateFormat.parse(inputDate);
        } catch (ParseException e) {
            throw new InputDataException("Ошибка: введенная дата некорректна", InputErrorTypeEnum.DateError, e);
        }
    }

    private boolean checkDateFormat(String inputDate){
        Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        Matcher matcher = pattern.matcher(inputDate);
        return matcher.find();
    }
    
    private void checkPhoneNumber() throws InputDataException{
        if (!checkPhoneNumberFormat(splitedArray[4]))
            throw new InputDataException("Ошибка: неверный формат номера телефона", InputErrorTypeEnum.PhoneNumberError);
    }

    private boolean checkPhoneNumberFormat(String splitedArray){
        Pattern pattern = Pattern.compile("^\\d{1,25}$");
        Matcher matcher = pattern.matcher(splitedArray);
        return matcher.find();
    }

    private void checkGender() throws InputDataException{
        Pattern pattern = Pattern.compile("^[f,m]$");
        Matcher matcher = pattern.matcher(splitedArray[5]);
        if (!matcher.find())
            throw new InputDataException(String.format("Ошибка: неверный формат данных для параметра \"пол\" (введено '%s')",splitedArray[5]), InputErrorTypeEnum.GenderError);
    }

    // private boolean checkInputDataClass(){
        
    //     if (splitedArray[0].getClass() & splitedArray[1].getClass() & splitedArray[2].getClass() != String.getClass()){
    //         throw new ClassCastException(String.format("Ошибка: неверный тип данных для параметра ФИО, введено: <%s><%S><$s>" , splitedArray[0], splitedArray[1], splitedArray[2]));
    //     }
    // }

    
}
