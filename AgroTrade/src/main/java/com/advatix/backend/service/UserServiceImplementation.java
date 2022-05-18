package com.advatix.backend.service;



import org.springframework.stereotype.Service;

import com.advatix.backend.model.Role;
import com.advatix.backend.model.User;
import com.advatix.backend.repository.UserRepository;
import com.advatix.backend.web.dto.UserRegistrationDto;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService{
/*
//
//    private UserRepository userRepository;
//
//    //private BCryptPasswordEncoder passwordEncoder;
//
//    public UserServiceImplementation(UserRepository userRepository) {
//        super();
//        this.userRepository = userRepository;
//    }
//
//    public User save(UserRegistrationDto registrationDto) {
//        User user = new User(registrationDto.getFirstName(),
//                registrationDto.getLastName(), registrationDto.getEmail(),
//                new BCryptPasswordEncoder().encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
//
//        return userRepository.save(user);
//    }
//
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(username);
//        if(user == null) {
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
//    }
//
//    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
//        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//    }
*/
	
}
