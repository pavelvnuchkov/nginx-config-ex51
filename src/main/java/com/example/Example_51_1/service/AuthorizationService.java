package com.example.Example_51_1.service;

import com.example.Example_51_1.exception.InvalidCredentials;
import com.example.Example_51_1.exception.UnauthorizedUser;
import com.example.Example_51_1.model.Authorities;
import com.example.Example_51_1.model.User;
import com.example.Example_51_1.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {

    private UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getUser()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentials("User name or password is Empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
