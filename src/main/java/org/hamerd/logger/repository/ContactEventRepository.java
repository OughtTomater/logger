package org.hamerd.logger.repository;

import org.hamerd.logger.model.ContactEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactEventRepository extends JpaRepository<ContactEvent, Long> {
}
