package geschwend.example.GeorgesServiceExample.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import java.util.Date;

/**
 * @author George C. Geschwend
 * @date 4/19/2023 12:40 AM
 * @project GeorgesServiceExample
 *
 * This class POJO represents the error response message to be sent back to the client application if an error is thrown.
 */
@Getter
public class ErrorResponse
{
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date errorTimeStamp;

    private int errorCode;

    private String errorDescription;

    private String errorMessage;

    private String errorSource;

    public ErrorResponse(int errorCode, String errorDescription, String errorMessage){

        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorMessage = errorMessage;
        this.errorTimeStamp = new Date();
        this.errorSource = "GEORGES_DEMO_WEBSERVICE";
    }

}
