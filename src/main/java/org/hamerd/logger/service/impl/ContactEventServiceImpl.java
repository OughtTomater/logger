package org.hamerd.logger.service.impl;

import org.hamerd.logger.model.ContactEvent;
import org.hamerd.logger.repository.ContactEventRepository;
import org.hamerd.logger.service.ContactEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ContactEventServiceImpl implements ContactEventService {

    @Autowired
    ContactEventRepository repository;


    @Override
    public ContactEvent saveContactEvent(ContactEvent contactEvent) {
        return repository.save(contactEvent);
    }

    @Override
    public List<ContactEvent> fetchContactEventList() {
        return repository.findAll();
    }

    @Override
    public ContactEvent updateContactEvent(ContactEvent contactEvent, long id) {
        ContactEvent ce = repository.findById(id).get();

        if (Objects.nonNull(contactEvent.getName()) && !"".equalsIgnoreCase(contactEvent.getName())) {
            ce.setName(contactEvent.getName());
        }

        if (Objects.nonNull(contactEvent.getCountry()) && !"".equalsIgnoreCase(contactEvent.getCountry())) {
            ce.setCountry(contactEvent.getCountry());
        }

        if (Objects.nonNull(contactEvent.getAddress()) && !"".equalsIgnoreCase(contactEvent.getAddress())) {
            ce.setAddress(contactEvent.getAddress());
        }

        if (Objects.nonNull(contactEvent.getStateProvince()) && !"".equalsIgnoreCase(contactEvent.getStateProvince())) {
            ce.setStateProvince(contactEvent.getStateProvince());
        }

        return repository.save(ce);
    }

    @Override
    public void deleteContactEvent(Long id) {
        repository.deleteById(id);
    }
}
