package com.ex.ecommerce.service;

import com.ex.ecommerce.dao.AddressRepository;
import com.ex.ecommerce.dao.UserRepository;
import com.ex.ecommerce.dtos.AddressDTO;
import com.ex.ecommerce.dtos.UserDTO;
import com.ex.ecommerce.entity.Address;
import com.ex.ecommerce.entity.User;
import com.ex.ecommerce.utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    public UserDTO saveUser(UserDTO userDTO){
        User user = UserMapper.INSTANCE.userDTOToUser(userDTO);
        Address address = user.getAddress();
        Address addressSaved = addressRepository.save(address);
        user.getAddress().setId(addressSaved.getId());

        User savedUser = userRepository.save(user);
        return UserMapper.INSTANCE.userToUserDTO(savedUser);
    }

    public List<UserDTO> getAllUsers(){
        List<User> users = userRepository.findAll();
        return UserMapper.INSTANCE.usersToUserDTOs(users);
    }
}
