package com.kononenko.kp32.data.mappers;

import androidx.annotation.NonNull;

import com.kononenko.kp32.data.Book;
import com.kononenko.kp32.data.room.BookEntity;

public class BookEntityToBookMapper implements Mapper<BookEntity, Book> {
    @Override
    public Book map(@NonNull BookEntity val) {
        return new Book(val.getId(), val.getName(), val.getAuthor(), val.getYear(), val.getNote());
    }
}
