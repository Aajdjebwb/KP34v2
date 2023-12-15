package com.kononenko.kp32.data.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.kononenko.kp32.data.Book;

import java.util.List;


@Dao
public interface BookDAO {
    @Query("SELECT * FROM Books")
    List<BookEntity> getAll();

    @Insert
    void insert(BookEntity book);

}

