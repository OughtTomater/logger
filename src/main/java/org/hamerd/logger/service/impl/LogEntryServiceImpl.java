package org.hamerd.logger.service.impl;

import org.hamerd.logger.model.LogEntry;
import org.hamerd.logger.repository.LogEntryRepository;
import org.hamerd.logger.service.LogEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LogEntryServiceImpl implements LogEntryService {

    @Autowired
    LogEntryRepository repository;


    @Override
    public LogEntry saveLogEntry(LogEntry logEntry) {
        return repository.save(logEntry);
    }

    @Override
    public List<LogEntry> fetchLogEntryList() {
        return (List<LogEntry>) repository.findAll();
    }

    @Override
    public LogEntry updateLogEntry(LogEntry logEntry, long id) {
        LogEntry entry = repository.findById(id).get();

        if (Objects.nonNull(logEntry.getCallsign())
                && !"".equalsIgnoreCase(
                logEntry.getCallsign())) {
            entry.setCallsign(logEntry.getCallsign());
        }

        if (Objects.nonNull(logEntry.getMode())
                && !"".equalsIgnoreCase(
                logEntry.getMode())) {
            entry.setMode(logEntry.getMode());
        }

        if (Objects.nonNull(logEntry.getBand())) {
            entry.setBand(logEntry.getBand());
        }

        return repository.save(entry);
    }

    @Override
    public void deleteLogEntry(Long id) {
        repository.deleteById(id);
    }
}
