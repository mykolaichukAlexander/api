package api.server.service.dto;

import api.server.entity.Address;
import api.server.entity.Role;
import lombok.Data;

@Data
public class UserDto {
    private String login;
    private String pass;
    private String email;
    private long phone;
    private String region;
    private String district;
    private String city;
    private String qwerty;
}
