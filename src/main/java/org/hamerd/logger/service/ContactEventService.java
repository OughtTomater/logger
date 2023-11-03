package org.hamerd.logger.service;

import org.hamerd.logger.model.ContactEvent;
import org.hamerd.logger.repository.ContactEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactEventService {
    @Autowired
    ContactEventRepository repository;

    public ContactEventService(ContactEventRepository repository) {
        this.repository = repository;
    }

    public void createContactEvent(ContactEvent contactEvent){
        repository.save(contactEvent);
    }
}
