package org.hamerd.logger.service;

import org.hamerd.logger.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> fetchUserList();

    User updateUser(User user, long id);

    void deleteUserById(Long id);
}
