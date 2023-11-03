package org.hamerd.logger.service;

import org.hamerd.logger.model.User;
import org.hamerd.logger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveNewUser(User user){
        repository.save(user);
    }
}
