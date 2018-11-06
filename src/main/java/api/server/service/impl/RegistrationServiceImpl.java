package api.server.service.impl;

import api.server.entity.Address;
import api.server.entity.Role;
import api.server.entity.User;
import api.server.entity.repository.AddressRepository;
import api.server.entity.repository.RoleRepository;
import api.server.entity.repository.UserRopository;
import api.server.service.RegistrationService;
import api.server.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.sql.Timestamp;
import java.util.Date;


@Slf4j
@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private final UserRopository userRopository;

    @Autowired
    private final AddressRepository addressRepository;

    @Autowired
    private final RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto addUser(UserDto userDto) {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        User user = modelMapper.map(userDto, User.class);
        Date date = new Date();
        long time = date.getTime();
        user.setRegistrationDate(new Timestamp(time));
        userRopository.save(user);
        log.info(user.toString());

        return userDto;

    }


}
