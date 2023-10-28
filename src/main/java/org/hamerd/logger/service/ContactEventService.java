package org.hamerd.logger.service;

import org.hamerd.logger.model.ContactEvent;

import java.util.List;

public interface ContactEventService {

    ContactEvent saveContactEvent(ContactEvent contactEvent);

    List<ContactEvent> fetchContactEventList();

    ContactEvent updateContactEvent(ContactEvent contactEvent, long id);

    void deleteContactEvent(Long id);
}
