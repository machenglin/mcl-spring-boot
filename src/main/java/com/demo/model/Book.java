package com.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Entity：表明它是一个JPA实体
 * @ID+@GeneratedValue：表明这个字段是实体的唯一标识，并且这个字段的值是自动生成的
 * Created by Mcl on 2018/5/22.
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String reader;

    public Book(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
