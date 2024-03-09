package org.bpj.uaa.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by taraneh on 4/26/2019.
 */

@Entity
public class Roles implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


}
