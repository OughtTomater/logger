package org.hamerd.logger.repository;

import org.hamerd.logger.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
