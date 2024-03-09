package org.bpj.uaa.service.impl;

import org.bpj.uaa.entity.Roles;
import org.bpj.uaa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import  org.bpj.uaa.repository.*;

import java.util.List;


/**
 * Created by taraneh on 4/26/2019.
 */

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Roles> getRoles() {
        return roleRepository.findAll();
    }
}
