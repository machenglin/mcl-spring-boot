package com.demo.controller;

import com.demo.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Mcl on 2018/5/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {
    @Autowired
    BookController bookController;

    @Test
    public void readersBooks() throws Exception {
        System.out.println(bookController.readersBooks("mcl"));
    }

    @Test
    public void addToReadingList() throws Exception {
        bookController.addToReadingList("mcl", new Book("spring-boot", "自动配置"));
        System.out.println();
    }

}