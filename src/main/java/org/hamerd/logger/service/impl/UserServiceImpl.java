package org.hamerd.logger.service.impl;

import org.hamerd.logger.model.User;
import org.hamerd.logger.repository.UserRepository;
import org.hamerd.logger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User updateUser(User user, long id) {
        User updateData = repository.findById(id).get();

        if (Objects.nonNull(user.getCallSign()) && !"".equalsIgnoreCase(user.getCallSign())) {
            updateData.setUserName(user.getCallSign());
        }

        if (Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
            updateData.setUserName(user.getUserName());
        }

        return repository.save(updateData);
    }

    @Override
    public void deleteUserById(Long id) {
        repository.deleteById(id);
    }
}
