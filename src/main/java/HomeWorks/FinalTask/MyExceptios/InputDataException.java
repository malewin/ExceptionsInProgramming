package HomeWorks.FinalTask.MyExceptios;

import java.io.IOException;

public class InputDataException extends IOException {
    public InputDataException(String message, InpDataErrType errorType, Throwable cause) {
        super(errorType+" ---> "+message, cause);
    }



    public InputDataException(String message, InpDataErrType errorType) {
        super(errorType+" ---> "+message);

    }
}
