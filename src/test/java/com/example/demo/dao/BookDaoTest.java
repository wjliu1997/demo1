
package com.example.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;
    @Test
    void test(){
        System.out.println(bookDao.selectById(1));
        Book book = new Book();
        book.setId(5);
        book.setName("5");
        book.setType("测试插入name");

        book.setDescription("测试插入name");

        bookDao.updateById(book);
        System.out.println(bookDao.selectById(5));
        System.out.println(bookDao.selectList(null));
        Page page = new Page(1,2);

        System.out.println(bookDao.selectPage(page,null).getRecords());

        QueryWrapper<Book> queryWrapper = new QueryWrapper();
        String name=null;
        queryWrapper.like(name!=null,"name",name);
        System.out.println("1111111");
        System.out.println(queryWrapper.getSqlSelect());
        System.out.println(queryWrapper.getEntity());
        bookDao.selectList(queryWrapper);


    }
}