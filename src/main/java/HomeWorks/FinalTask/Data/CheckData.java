package HomeWorks.FinalTask.Data;

import HomeWorks.FinalTask.MyExceptios.InputDataException;

public abstract class CheckData {

    protected String[] splitData;
    protected int providedLength;

    public String[] getSplitData() {
        return splitData;
    }

    public void setSplitData(String[] splitData) {
        this.splitData = splitData;
    }

    public abstract boolean isValidData() throws InputDataException;
}
