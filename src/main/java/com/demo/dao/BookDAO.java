package com.demo.dao;

import com.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 定义仓库接口
 * Created by Mcl on 2018/5/22.
 */
public interface BookDAO extends JpaRepository<Book, Long>{

    List<Book> findByReader(String reader);
}
