package com.kononenko.kp32.data;

import com.kononenko.kp32.basic.concurency.TaskCallback;

import java.util.List;

public interface BookRepository {
    void addNewBook(Book book,TaskCallback<Boolean> callback);

    void getAllBooks(TaskCallback<List<Book>> callback);
}
