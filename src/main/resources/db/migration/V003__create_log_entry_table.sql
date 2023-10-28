CREATE TABLE logger.log_entry(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name varchar(255),
    address varchar(255),
    state_province varchar(255),
    country varchar(255),
    contact_event_id MEDIUMINT,
    PRIMARY KEY (id),
    FOREIGN KEY (contact_event_id) REFERENCES contact_event(id)
);