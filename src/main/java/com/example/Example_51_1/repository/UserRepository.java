package com.example.Example_51_1.repository;
import com.example.Example_51_1.model.Authorities;
import com.example.Example_51_1.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private Map<User, List<Authorities>> userList = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(User user) {
        return userList.get(user);
    }

}
