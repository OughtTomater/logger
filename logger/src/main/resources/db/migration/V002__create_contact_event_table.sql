CREATE TABLE contact_event(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    callsign varchar(255) NOT NULL,
    create_date datetime,
    mode varchar(255) NOT NULL,
    band INT(11) NOT NULL,
    user_id MEDIUMINT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);