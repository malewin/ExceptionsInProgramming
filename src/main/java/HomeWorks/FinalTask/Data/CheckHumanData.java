package HomeWorks.FinalTask.Data;

import HomeWorks.FinalTask.MyExceptios.InpDataErrType;
import HomeWorks.FinalTask.MyExceptios.InputDataException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckHumanData extends CheckData{

    public CheckHumanData() {
        providedLength = 6;
    }


    @Override
    public boolean isValidData() throws InputDataException{
        checkInputDataLength();
        checkFIO();
        checkDate();
        checkPhoneNumber();
        checkGender();
        return true;
// до return true выполнение дойдет лишь в том случае, если ни один из предыдущих методов проверки не выдаст InputDataException
    }

    private void checkInputDataLength () throws InputDataException{
        int checkLength = splitData.length;
        if (checkLength!=providedLength) {
            if (checkLength < providedLength)
                throw new InputDataException(String.format("Ошибка: количество введенных параметров меньше необходимого (<%s)", providedLength), InpDataErrType.DataLengthError);
            else
                throw new InputDataException(String.format("Ошибка: количество введенных параметров больше необходимого (>%s),", providedLength), InpDataErrType.DataLengthError);
        }
    }


    private void checkFIO() throws InputDataException{
        for (int i=0; i<3; i++) {
            if (!checkNameFormat(splitData[i]))
                throw new InputDataException(String.format("Ошибка: неверный формат при вводе ФИО - '%s'", splitData[i]), InpDataErrType.NameError);
            }
        }

    private boolean checkNameFormat(String name){
        Pattern pattern = Pattern.compile("^[а-яА-Я-]{1,20}$");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }



    private void checkDate() throws InputDataException{
        String inputDate = splitData[3];
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        if (!checkDateFormat(inputDate))
            throw new InputDataException("Ошибка: неверный формат даты", InpDataErrType.DateError);
        try {
            dateFormat.parse(inputDate);
        } catch (ParseException e) {
            throw new InputDataException("Ошибка: введенная дата некорректна (существует ли данный день?)", InpDataErrType.DateError, e);
        }
    }


    private boolean checkDateFormat(String inputDate){
        Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
        Matcher matcher = pattern.matcher(inputDate);
        return matcher.find();
    }


    private void checkPhoneNumber() throws InputDataException{
        if (!checkPhoneNumberFormat(splitData[4]))
            throw new InputDataException("Ошибка: неверный формат номера телефона", InpDataErrType.PhoneNumberError);
    }

    private boolean checkPhoneNumberFormat(String inputDate){
        Pattern pattern = Pattern.compile("^\\d{1,25}$");
        Matcher matcher = pattern.matcher(inputDate);
        return matcher.find();
    }

    private void checkGender() throws InputDataException{
        Pattern pattern = Pattern.compile("^[f,m]$");
        Matcher matcher = pattern.matcher(splitData[5]);
        if (!matcher.find())
            throw new InputDataException(String.format("Ошибка: неверный формат данных для параметра \"пол\" (введено '%s')",splitData[5]), InpDataErrType.GenderError);
    }

}
