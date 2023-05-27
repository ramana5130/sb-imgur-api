package com.ram.imgur.service;

import com.ram.imgur.entity.User;
import com.ram.imgur.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User registerUser(User user) {
        User saveduser = userRepository.save(user);
        return saveduser;
    }
}
