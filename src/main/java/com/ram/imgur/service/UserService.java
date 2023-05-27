package com.ram.imgur.service;

import com.ram.imgur.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    User registerUser(User user);
}
