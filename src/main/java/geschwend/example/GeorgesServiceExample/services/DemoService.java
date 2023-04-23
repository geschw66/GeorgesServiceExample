package geschwend.example.GeorgesServiceExample.services;

import geschwend.example.GeorgesServiceExample.DTO.GreetingRequestWrapper;
import geschwend.example.GeorgesServiceExample.DTO.GreetingResponse;
import geschwend.example.GeorgesServiceExample.DTO.GreetingResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author George C. Geschwend
 * @date 4/18/2023 7:38 PM
 * @project GeorgesServiceExample
 *
 * This service is a sample stub service that returns the client apps name attribute or parameter
 * along with a hard coded greeting. Very basic test to see if things are behaving correctly.
 */
@Service
@Slf4j
public class DemoService {

    public GreetingResponseWrapper greetingService(GreetingRequestWrapper greetingRequestWrapper){

        log.info("Inside the greetingService() service method.");

       return new GreetingResponseWrapper( new GreetingResponse("Hello "+ greetingRequestWrapper.getGreetingRequest().getName()+"!!!"));

    }
}
