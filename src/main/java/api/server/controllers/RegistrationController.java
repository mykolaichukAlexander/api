package api.server.controllers;


import api.server.entity.User;
import api.server.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegistrationController {

    @Autowired
    private final RegistrationService registrationService;

    @PostMapping("/reg")
    public User registration(@RequestBody User user){return registrationService.addUser(user);}


}
