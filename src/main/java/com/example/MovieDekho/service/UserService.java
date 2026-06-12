package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.User;
import com.example.MovieDekho.respository.UserRepository;
import com.example.MovieDekho.service.intface.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public User loginUser(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
