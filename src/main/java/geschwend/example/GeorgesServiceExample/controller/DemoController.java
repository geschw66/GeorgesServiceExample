package geschwend.example.GeorgesServiceExample.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import geschwend.example.GeorgesServiceExample.DTO.GreetingRequestWrapper;
import geschwend.example.GeorgesServiceExample.DTO.GreetingResponseWrapper;
import geschwend.example.GeorgesServiceExample.error.GreetingRequestException;
import geschwend.example.GeorgesServiceExample.services.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;

@RestController
@Slf4j
public class DemoController {

    @Autowired
    DemoService demoService;

    @PostMapping( path= "/georgetest/v1/greeting1", produces = "application/json")
    public ResponseEntity<String> greeting(@RequestBody GreetingRequestWrapper greetingRequestWrapper) throws JsonProcessingException, GreetingRequestException {
        validateGreetingRequest(greetingRequestWrapper);
        GreetingResponseWrapper response = demoService.greetingService(greetingRequestWrapper);
        ObjectMapper mapper = new ObjectMapper();
        String strResp = mapper.writeValueAsString(response);
        return new ResponseEntity(strResp, HttpStatus.OK);
    }


    @PostMapping( path= "/georgetest/v1/greeting2", produces = "application/json")
    public ResponseEntity<String> greeting2(@RequestBody GreetingRequestWrapper greetingRequestWrapper) throws JsonProcessingException, GreetingRequestException {

        validateGreetingRequest(greetingRequestWrapper);
        return new ResponseEntity<>(new ObjectMapper().writeValueAsString(demoService.greetingService(greetingRequestWrapper)), HttpStatus.OK);
    }

    private void validateGreetingRequest(GreetingRequestWrapper greetingRequestWrapper) throws GreetingRequestException {

        String name = greetingRequestWrapper.getGreetingRequest().getName();
        if( name == null || name.isBlank()){

            throw new GreetingRequestException("Hey you forgot the name!");
        }
    }
}
