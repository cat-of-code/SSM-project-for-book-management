package com.zhaochen.service;

import com.zhaochen.dao.BookMapper;
import com.zhaochen.pojo.Books;
import lombok.Lombok;

import java.awt.print.Book;
import java.util.List;

public class BookServiceImpl implements BookService {
    //注入Dao对象
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }


}
