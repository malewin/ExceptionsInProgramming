package HomeWorks.LastTask.Exceptions;

import java.io.IOException;

import HomeWorks.LastTask.Exceptions.InputErrorTypeEnum;

public class InputDataException extends IOException {
    public InputDataException(String message, InputErrorTypeEnum dateerror, Throwable cause) {
        super(dateerror+" ---> "+message, cause);
    }



    public InputDataException(String message, InputErrorTypeEnum errorType) {
        super(errorType+" ---> "+message);

    }
}

