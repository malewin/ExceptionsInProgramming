package HomeWorks.LastTask.Data;

/**
 * Human
 */
public class Human {

    protected String firstName; // Фамилия
    protected String secondName; // Имя
    protected String lastName; // Отчество
    protected String bitrhday;
    protected String phonenumber;
    protected String gender;


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setBirthday(String birthday){
        this.bitrhday = birthday;
    }

    public String getBirthday(){
        return bitrhday;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phonenumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phonenumber;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getCharacter(){
        return gender;
    }

    @Override
    public String toString(){
        return String.format("<%s><%s><%s><%s><%s><%s>", firstName, secondName, lastName, bitrhday, phonenumber, gender);
    }

}