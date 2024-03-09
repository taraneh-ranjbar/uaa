package org.bpj.uaa.controller;

import org.bpj.uaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by taraneh on 4/26/2019.
 */

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public ResponseEntity<?> getuser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getuser());
    }

    @GetMapping(value = "/msg")
    public ResponseEntity<?> getmsg(){
        return ResponseEntity.status(HttpStatus.OK).body("msg users");
    }

}
