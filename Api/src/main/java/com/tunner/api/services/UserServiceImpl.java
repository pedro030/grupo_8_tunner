package com.tunner.api.services;

import com.tunner.api.entities.User;
import com.tunner.api.repositories.BaseRepository;
import com.tunner.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(BaseRepository<User, Long> baseRepository){
        super(baseRepository);
    }
}
