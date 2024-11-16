package com.coc.game.service;

import com.coc.game.dto.UserDTO;
import com.coc.game.pojo.User;
import com.coc.game.dao.UserDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String register(User user) {
        if (userDao.findByEmail(user.getEmail()) != null) {
            return "User already exists!";
        }
        userDao.save(user);
        return "User registered successfully!";
    }

    public String login(String email, String password) {
        User user = userDao.findByEmail(email);
        if (user == null || !user.getPassword().equals(password)) {
            return "Invalid email or password!";
        }
        return "Login successful!";
    }


    public UserDTO getUserById(Long id) {
        User user = userDao.findById(id).orElseThrow(() -> new RuntimeException("用户未找到"));
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }
}