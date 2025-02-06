package initiativep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import initiativep.dto.UserDto;
import initiativep.model.User;
import initiativep.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUSer(userDto);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    //     userService.deleteUser(id);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UserDto userDTO) {
    //     User updatedUser = userService.updateUser(id, userDTO);
    //     return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    // }
}

