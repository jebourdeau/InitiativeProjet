package initiativep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import initiativep.model.User;

import java.util.ArrayList;


//@Service
//public class UserSecurityService implements UserDetailsService {
//    private final UserService userService;
//    @Autowired
//    public UserSecurityService(UserService userService){
//        this.userService = userService;
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = (User) userService.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found!"));
//
//        return org.springframework.security.core.userdetails.User.builder()
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .authorities(new ArrayList<>())
//                .build();
//    }
//}
