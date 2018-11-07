package api.server.controllers;




import api.server.api.ApiResponse;
import api.server.api.Responses;
import api.server.service.RegistrationService;
import api.server.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import lombok.extern.slf4j.Slf4j;




@Slf4j
@RestController
@RequiredArgsConstructor
public class RegistrationController {

    @Autowired
    private final RegistrationService registrationService;


    @PostMapping("/reg")
    public ApiResponse<UserDto> registration(@RequestBody UserDto user){
        registrationService.addUser(user);
        return Responses.okResp(user);
    }

}
