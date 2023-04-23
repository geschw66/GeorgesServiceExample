package geschwend.example.GeorgesServiceExample.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import geschwend.example.GeorgesServiceExample.error.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author George C. Geschwend
 * @date 4/19/2023 12:30 AM
 * @project GeorgesServiceExample
 */
@ControllerAdvice
@Slf4j
public class CustomControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(GreetingRequestException.class)
    public ResponseEntity<ErrorResponse> handleGreetingRequestException(Exception ex){
        /*Potential custom logic would good here (i.e. log a trace in the error log)*/

        HttpStatus status = HttpStatus.BAD_REQUEST;
        log.error("Inside custom exception handler: handleGreetingRequestException: GreetingRequestException thrown.");

        String message;
        if(ex.getMessage() == null || ex.getMessage().isBlank()){
            /* Print the default message */
            message = "GreetingRequestException thrown: something is wrong with the incomming request messsage";
        }else{
            message = ex.getMessage();
        }

        return new ResponseEntity<>(
                new ErrorResponse(
                        ExceptionErrors.GREETING_REQUEST_EXCEPTION.getHttpCode(),
                        ExceptionErrors.GREETING_REQUEST_EXCEPTION.getName(),
                        message
                ),
                status
        );

    }
}
