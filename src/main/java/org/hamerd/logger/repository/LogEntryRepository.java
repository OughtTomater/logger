package org.hamerd.logger.repository;

import org.hamerd.logger.model.LogEntry;
import org.springframework.data.repository.CrudRepository;

public interface LogEntryRepository extends CrudRepository<LogEntry, Long> {
}
