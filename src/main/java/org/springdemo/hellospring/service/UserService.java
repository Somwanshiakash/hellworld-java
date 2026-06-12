package org.springdemo.hellospring.service;

import org.springdemo.hellospring.entiry.User;
import org.springdemo.hellospring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepository;

    @Autowired
    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);
        return userRepository.findAll();
    }
}
