package com.eduardo.springboot.error.springboot_error.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<>();
        users.add(new User(1L, "ISDH", "ISDH"));
        users.add(new User(2L, "Eduardo", "Ramos"));
        users.add(new User(3L, "Charles", "Ramos"));
        users.add(new User(4L, "Naomi", "Gonzalez"));
        users.add(new User(5L, "Juana", "Perez"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;
        for(User u : users){
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
        
        return user;
    }
      
}
