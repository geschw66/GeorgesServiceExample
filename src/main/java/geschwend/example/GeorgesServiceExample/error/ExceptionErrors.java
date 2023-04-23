package geschwend.example.GeorgesServiceExample.error;


import lombok.Getter;

/**
 * @author George C. Geschwend
 * @date 4/19/2023 12:40 AM
 * @project GeorgesServiceExample
 *
 * This enum holds constant values pertaining to exceptions thrown.
 *  <ul>
 *    <li>httpCode: the http return code</li>
 *    <li>name: the name of the exception or error</li>
 *  </ul>
 */
@Getter
public enum ExceptionErrors {

    GREETING_REQUEST_EXCEPTION(400, "GREETING_REQUEST_EXCEPTION");
    private int httpCode;
    private String name;

    ExceptionErrors(int httpCode, String name){
        this.httpCode = httpCode;
        this.name = name;
    }
}
