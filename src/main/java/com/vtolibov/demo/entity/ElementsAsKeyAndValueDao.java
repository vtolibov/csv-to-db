package com.vtolibov.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class ElementsAsKeyAndValueDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "code")
    private Integer key;
    @Column(name = "text")
    private Integer value;
}
