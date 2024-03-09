package org.bpj.uaa.service;

import org.aspectj.apache.bcel.classfile.Module;
import org.bpj.uaa.entity.Users;

import java.util.List;

/**
 * Created by taraneh on 4/26/2019.
 */
public interface UserService {

    List<Users> getuser();
}

