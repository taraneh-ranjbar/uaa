package org.bpj.uaa.controller;

import org.bpj.uaa.service.RoleService;
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
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/role")
    public ResponseEntity<?> getRole(){
        return ResponseEntity.status(HttpStatus.OK).body(roleService.getRoles());
    }
}
