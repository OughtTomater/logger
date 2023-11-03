package org.hamerd.logger.controller;

import org.hamerd.logger.model.ContactEvent;
import org.hamerd.logger.model.User;
import org.hamerd.logger.service.ContactEventService;
import org.hamerd.logger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logController {

    @Autowired
    UserService service;

    @PostMapping("/User")
    public ResponseEntity createNewUser(@RequestBody User user){
        service.saveNewUser(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }


}
