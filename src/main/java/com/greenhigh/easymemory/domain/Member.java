package com.greenhigh.easymemory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String username;
    private Integer age;
}
