package geschwend.example.GeorgesServiceExample.error;

/**
 * @author George C. Geschwend
 * @date 4/19/2023 12:21 AM
 * @project GeorgesServiceExample
 *
 * This custom class is thrown when a request message is malformed.
 */
public class GreetingRequestException extends Exception {
    public GreetingRequestException(String errorMessage) { super(errorMessage);}
}
