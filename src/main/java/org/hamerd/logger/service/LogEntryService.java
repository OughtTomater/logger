package org.hamerd.logger.service;

import org.hamerd.logger.model.LogEntry;

import java.util.List;

public interface LogEntryService {

    LogEntry saveLogEntry(LogEntry logEntry);

    List<LogEntry> fetchLogEntryList();

    LogEntry updateLogEntry(LogEntry logEntry, long id);

    void deleteLogEntry(Long id);
}
