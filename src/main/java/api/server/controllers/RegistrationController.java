package api.server.controllers;



import api.server.entity.Address;
import api.server.entity.Role;
import api.server.entity.User;
import api.server.service.RegistrationService;
import api.server.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RegistrationController {

    @Autowired
    private final RegistrationService registrationService;


    @PostMapping("/reg")
    public UserDto registration(@RequestBody UserDto user){
        log.info("DTO is "+user.toString());



        return registrationService.addUser(user);}


}
