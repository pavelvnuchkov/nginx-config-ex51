package com.example.Example_51_1.controller;
import com.example.Example_51_1.config.ParamQuery;
import com.example.Example_51_1.model.Authorities;
import com.example.Example_51_1.model.User;
import com.example.Example_51_1.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {

    private AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@ParamQuery("user") String name,
                                            @ParamQuery("password") String password,
                                            @Valid User user) {
        System.out.println("Параметр user - " + name);
        System.out.println("Параметр password - " + password);
        System.out.println("Параметр object(user) - " + user);
        return service.getAuthorities(user);
    }
}
