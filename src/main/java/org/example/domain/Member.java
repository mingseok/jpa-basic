package org.example.domain;

import javax.persistence.*;

@Entity
public class Member extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "USERNAME")
    private String name;

    @Embedded
    private Period period;

    @Embedded
    private Address address;

}