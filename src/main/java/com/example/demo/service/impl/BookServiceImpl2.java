package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.BookDao;
import com.example.demo.domain.Book;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {

        return bookDao.selectPage(new Page<>(currentPage,pageSize),null);
    }
}
