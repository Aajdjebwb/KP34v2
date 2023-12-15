package com.kononenko.kp32.data.mappers;

import androidx.annotation.NonNull;

import com.kononenko.kp32.data.Book;
import com.kononenko.kp32.data.room.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookEntitiesListToBookList implements Mapper<List<BookEntity>, List<Book>> {

    @Override
    public List<Book> map(@NonNull List<BookEntity> value) {
        BookEntityToBookMapper mapper=new BookEntityToBookMapper();
        List<Book> result=new ArrayList<>();
        for(BookEntity book:value){
            result.add(mapper.map(book));
        }
        return result;
    }
}
