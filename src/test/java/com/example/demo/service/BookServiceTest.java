package com.example.demo.service;

import com.example.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据124");
        book.setName("测试数据124");
        book.setDescription("测试数据124");
        System.out.println(bookService.save(book));
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setType("测试数据1abc");
        book.setName("测试数据124");
        book.setDescription("测试数据124");
        book.setId(6);
        System.out.println(bookService.update(book));
    }
    @Test
    void testDelete(){
        System.out.println(bookService.delete(1));
    }
    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }
    @Test
    void testGetPage(){
        System.out.println(bookService.getPage(1,2).getRecords());
    }
}
