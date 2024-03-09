package org.bpj.uaa.service.impl;

import org.bpj.uaa.entity.Users;
import org.bpj.uaa.repository.UserRepository;
import org.bpj.uaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by taraneh on 4/26/2019.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getuser() {
        return userRepository.findAll();
    }
}
