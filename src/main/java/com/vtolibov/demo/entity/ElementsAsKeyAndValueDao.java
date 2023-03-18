package com.vtolibov.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_table")
public class ElementsAsKeyAndValueDao extends BaseEntity{

    @Column(name = "code")
    private Integer key;
    @Column(name = "text")
    private String value;
}
