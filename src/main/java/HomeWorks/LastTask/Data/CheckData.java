package HomeWorks.LastTask.Data;

import java.io.IOException;

import javax.naming.directory.InvalidAttributeIdentifierException;

import HomeWorks.LastTask.Exceptions.InputDataException;

public abstract class CheckData {
    protected String [] splitedArray;

    protected int phraseLength;
    
    public String[] getSplitedArray() {
        return splitedArray;
    }

    public void setSplitedArray(String [] splitedArray) {
        this.splitedArray = splitedArray;
    }

    public abstract boolean isValidData() throws InputDataException;
}
