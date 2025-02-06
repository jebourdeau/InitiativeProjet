package initiativep.services;

import initiativep.model.Role;
import initiativep.repository.RoleRepository;
import initiativep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import initiativep.model.User;

import java.util.Collections;
import java.util.NoSuchElementException;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import initiativep.dto.UserDto;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    public User createUser(UserDto userDTO) {
        User user = User.builder()
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .password(new BCryptPasswordEncoder().encode(userDTO.getPassword()))
                .build();
        Role userRole = roleRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("User Role not set."));
        user.setRoles(Collections.singleton(userRole));
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, UserDto userDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        return userRepository.save(user);
    }

    public User findById(Long id) {
        User user= userRepository.findUserById(id).orElseThrow(()-> new RuntimeException("not found"));
        user.setUsername(user.getUsername());
        return userRepository.save(user);
    }
    public User findUserById(Long id){
    return userRepository.findById(id).orElse(null);
    }
}