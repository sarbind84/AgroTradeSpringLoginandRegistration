package com.advatix.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.advatix.backend.service.UserService;
import com.advatix.backend.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService){
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    //This method handles Get requests
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    //For registration, we have to create POST method which this class passes user's data to the database
    //This method handles Post requests
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        //userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
