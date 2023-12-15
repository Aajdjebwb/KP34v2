package com.kononenko.kp32.data.mappers;

import androidx.annotation.NonNull;

import com.kononenko.kp32.data.Book;
import com.kononenko.kp32.data.room.BookEntity;

public class BookToBookEntityMapper implements Mapper<Book, BookEntity> {
    @Override
    public BookEntity map(@NonNull Book val) {
        return new BookEntity(val.getName(),val.getAuthor(), val.getYear(),val.getNote());
    }
}
