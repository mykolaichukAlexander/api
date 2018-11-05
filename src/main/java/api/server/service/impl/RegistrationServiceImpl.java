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
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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

        Address address = modelMapper.map(userDto, Address.class);
        addressRepository.save(address);
        Role role = modelMapper.map(userDto, Role.class);
        roleRepository.save(role);
        User user = modelMapper.map(userDto, User.class);
        userRopository.save(user);
        return userDto;

    }


}
