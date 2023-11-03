package org.hamerd.logger.repository;

import org.hamerd.logger.model.ContactEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ContactEventRepository extends CrudRepository<ContactEvent, Long> {
}
