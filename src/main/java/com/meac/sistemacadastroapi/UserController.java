package com.meac.sistemacadastroapi;

import com.meac.sistemacadastroapi.model.User;
import com.meac.sistemacadastroapi.repositories.UserRepository;
import com.meac.sistemacadastroapi.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> findAll() {
        return userServices.getAllUsers();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userServices.createUser(user);
    }

}
