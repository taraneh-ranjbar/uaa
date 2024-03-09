package org.bpj.uaa.repository;

import org.bpj.uaa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by taraneh on 4/26/2019.
 */


public interface UserRepository extends JpaRepository<Users,Long> {
}
