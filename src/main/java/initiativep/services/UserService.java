package initiativep.services;

import org.springframework.security.core.Authentication;

import initiativep.model.User;

import java.util.Optional;

import org.springframework.stereotype.Service;

import initiativep.dto.RegisterDto;
import initiativep.dto.UserDto;

@Service
public interface UserService {
    void saveUser(UserDto user);
    void saveUser(RegisterDto userMapping);

    Optional<User>findByUsername(String username);
    Optional<User>findbyEmail(String email);
    Optional<User>from (Authentication authentication);
}
