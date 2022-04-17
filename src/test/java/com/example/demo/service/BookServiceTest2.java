package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest2 {
    @Autowired
    private IBookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据1234");
        book.setName("测试数据1234");
        book.setDescription("测试数据1234");
        System.out.println(bookService.save(book));
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setType("测试数据1abc");
        book.setName("测试数据124");
        book.setDescription("测试数据124");
        book.setId(6);
        System.out.println(bookService.updateById(book));
    }
    @Test
    void testDelete(){
        System.out.println(bookService.removeById(1));
    }
    @Test
    void testGetAll(){
        System.out.println(bookService.list());
    }
    @Test
    void testGetPage(){
        System.out.println(bookService.page(new Page<Book>(1, 2)).getRecords());
    }
}
