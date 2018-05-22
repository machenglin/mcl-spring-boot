package com.demo.controller;

import com.demo.dao.BookDAO;
import com.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Mcl on 2018/5/22.
 */
@Controller
@RequestMapping("/")
public class BookController {
    private BookDAO bookDAO;

    @Autowired
    public BookController(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @ResponseBody
    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public List<Book> readersBooks(@PathVariable("reader") String reader) {
        List<Book> bookList = bookDAO.findByReader(reader);
        return bookList;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        bookDAO.save(book);
        return "redirect:/{reader}";
    }
}
